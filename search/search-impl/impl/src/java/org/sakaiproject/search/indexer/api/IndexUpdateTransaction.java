/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006, 2007 The Sakai Foundation.
 *
 * Licensed under the Educational Community License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/ecl1.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.search.indexer.api;

import java.util.Iterator;

import org.apache.lucene.index.IndexWriter;
import org.sakaiproject.search.model.SearchBuilderItem;
import org.sakaiproject.search.transaction.api.IndexTransaction;
import org.sakaiproject.search.transaction.api.IndexTransactionException;


/**
 * This represents a transactional index operation
 * 
 * @author ieb
 */
public interface IndexUpdateTransaction extends IndexTransaction
{
	
	/**
	 * Get the index writer associated with this transaction
	 * 
	 * @return
	 * @throws IndexTransactionException
	 *         if the transaction is not open
	 */
	IndexWriter getIndexWriter() throws IndexTransactionException;

	/**
	 * Get a list of add items associated with this transaction
	 * 
	 * @return
	 * @throws IndexTransactionException
	 *         if the transaction is not open
	 */
	Iterator<SearchBuilderItem> addItemIterator() throws IndexTransactionException;

	/**
	 * @return
	 */
	String getTempIndex();

	
	
}
