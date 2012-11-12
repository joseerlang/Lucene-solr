/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.solr.highlight;

import org.apache.lucene.search.highlight.Encoder;
import org.apache.lucene.search.highlight.SimpleHTMLEncoder;
import org.apache.solr.common.params.SolrParams;

/**
 * Use the {@link org.apache.lucene.search.highlight.SimpleHTMLEncoder}
 *
 */
public class HtmlEncoder extends HighlightingPluginBase implements SolrEncoder {

  public Encoder getEncoder(String fieldName, SolrParams params) {
    return new SimpleHTMLEncoder();
  }

  ///////////////////////////////////////////////////////////////////////
  //////////////////////// SolrInfoMBeans methods ///////////////////////
  ///////////////////////////////////////////////////////////////////////

  @Override
  public String getDescription() {
    return "HtmlEncoder";
  }

  @Override
  public String getSource() {
    return "$URL: http://svn.apache.org/repos/asf/lucene/dev/trunk/solr/core/src/java/org/apache/solr/highlight/HtmlEncoder.java $";
  }
}
