package org.eclipse.rdf4j.sail.readonly.backend.bplus.indexes;

import org.eclipse.rdf4j.model.IRI;
import org.eclipse.rdf4j.model.Resource;
import org.eclipse.rdf4j.model.Statement;
import org.eclipse.rdf4j.model.Value;
import org.eclipse.rdf4j.sail.readonly.backend.bplus.BplusTree;
import org.eclipse.rdf4j.sail.readonly.backend.bplus.ListIterable;
import org.eclipse.rdf4j.sail.readonly.backend.bplus.comparators.*;

import java.util.ArrayList;
import java.util.List;

public class OPSIndex {
	BplusTree<Statement> index;

	public OPSIndex(List<Statement> collect) {

		collect = new ArrayList<>(collect);

		collect.sort(new OPSCComparator());

		index = new BplusTree<>(collect, new OPSCComparator());

	}

	public ListIterable getStatements(Resource subject, IRI predicate, Value object, Resource[] context) {
		return null;
	}
}
