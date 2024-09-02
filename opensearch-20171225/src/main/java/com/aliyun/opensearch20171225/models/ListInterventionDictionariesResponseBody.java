// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListInterventionDictionariesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about each intervention dictionary.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/173608.html">InterventionDictionary</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListInterventionDictionariesResponseBodyResult> result;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListInterventionDictionariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInterventionDictionariesResponseBody self = new ListInterventionDictionariesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInterventionDictionariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInterventionDictionariesResponseBody setResult(java.util.List<ListInterventionDictionariesResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInterventionDictionariesResponseBodyResult> getResult() {
        return this.result;
    }

    public ListInterventionDictionariesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInterventionDictionariesResponseBodyResult extends TeaModel {
        /**
         * <p>The custom analyzer.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("analyzer")
        public String analyzer;

        /**
         * <p>The time when the intervention dictionary was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1539158325</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The ID of the intervention dictionary.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Integer id;

        /**
         * <p>The name of the intervention dictionary.</p>
         * 
         * <strong>example:</strong>
         * <p>tongyici</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the intervention dictionary. Valid values:</p>
         * <ul>
         * <li>stopword: an intervention dictionary for stop word filtering</li>
         * <li>synonym: an intervention dictionary for synonym configuration</li>
         * <li>correction: an intervention dictionary for spelling correction</li>
         * <li>category_prediction: an intervention dictionary for category prediction</li>
         * <li>ner: an intervention dictionary for named entity recognition (NER)</li>
         * <li>term_weighting: an intervention dictionary for term weight analysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>synonym</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the intervention dictionary was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1539158313</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ListInterventionDictionariesResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInterventionDictionariesResponseBodyResult self = new ListInterventionDictionariesResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInterventionDictionariesResponseBodyResult setAnalyzer(String analyzer) {
            this.analyzer = analyzer;
            return this;
        }
        public String getAnalyzer() {
            return this.analyzer;
        }

        public ListInterventionDictionariesResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListInterventionDictionariesResponseBodyResult setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListInterventionDictionariesResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInterventionDictionariesResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInterventionDictionariesResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
