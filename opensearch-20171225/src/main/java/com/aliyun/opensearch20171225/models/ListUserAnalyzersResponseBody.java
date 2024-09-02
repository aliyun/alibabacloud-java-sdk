// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The custom analyzer.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178934.html">UserAnalyzer</a>.</p>
     */
    @NameInMap("result")
    public java.util.List<ListUserAnalyzersResponseBodyResult> result;

    /**
     * <p>The total number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListUserAnalyzersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserAnalyzersResponseBody self = new ListUserAnalyzersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserAnalyzersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserAnalyzersResponseBody setResult(java.util.List<ListUserAnalyzersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListUserAnalyzersResponseBodyResult> getResult() {
        return this.result;
    }

    public ListUserAnalyzersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListUserAnalyzersResponseBodyResultDicts extends TeaModel {
        /**
         * <p>Indicates whether the application is available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <p>The timestamp when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1588054131</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The number of intervention entries.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("entriesCount")
        public Integer entriesCount;

        /**
         * <p>The maximum number of intervention entries that can be created in the dictionary.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("entriesLimit")
        public Integer entriesLimit;

        /**
         * <p>The ID of the dictionary.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type. Valid value:</p>
         * <ul>
         * <li>segment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>segment</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1588054131</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ListUserAnalyzersResponseBodyResultDicts build(java.util.Map<String, ?> map) throws Exception {
            ListUserAnalyzersResponseBodyResultDicts self = new ListUserAnalyzersResponseBodyResultDicts();
            return TeaModel.build(map, self);
        }

        public ListUserAnalyzersResponseBodyResultDicts setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListUserAnalyzersResponseBodyResultDicts setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListUserAnalyzersResponseBodyResultDicts setEntriesCount(Integer entriesCount) {
            this.entriesCount = entriesCount;
            return this;
        }
        public Integer getEntriesCount() {
            return this.entriesCount;
        }

        public ListUserAnalyzersResponseBodyResultDicts setEntriesLimit(Integer entriesLimit) {
            this.entriesLimit = entriesLimit;
            return this;
        }
        public Integer getEntriesLimit() {
            return this.entriesLimit;
        }

        public ListUserAnalyzersResponseBodyResultDicts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserAnalyzersResponseBodyResultDicts setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUserAnalyzersResponseBodyResultDicts setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

    public static class ListUserAnalyzersResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether the application is available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <p>The basic analyzer. Valid values:</p>
         * <ul>
         * <li>chn_standard: <a href="https://help.aliyun.com/document_detail/179424.html">a common analyzer in Chinese</a></li>
         * <li>chn_scene_name: an analyzer for person names in Chinese</li>
         * <li>chn_ecommerce: <a href="https://help.aliyun.com/document_detail/179424.html">an analyzer for E-commerce in Chinese</a></li>
         * <li>chn_it_content: <a href="https://help.aliyun.com/document_detail/179424.html">an analyzer for IT content in Chinese</a></li>
         * <li>en_min: a small-granularity analyzer in English</li>
         * <li>th_standard: a common analyzer in Thai</li>
         * <li>th_ecommerce: an analyzer for E-commerce in Thai</li>
         * <li>vn_standard: a common analyzer in Vietnamese</li>
         * <li>chn_community_it: an analyzer for IT community content in Chinese</li>
         * <li>chn_ecommerce_general: a common analyzer for the E-commerce industry in Chinese</li>
         * <li>chn_esports_general: a common analyzer for the gaming industry in Chinese</li>
         * <li>chn_edu_question: an analyzer for question search of the education industry in Chinese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>chn_standard</p>
         */
        @NameInMap("business")
        public String business;

        /**
         * <p>The timestamp when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1588054131</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The dictionaries that are used by the custom analyzer.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/178933.html">UserDict</a>.</p>
         */
        @NameInMap("dicts")
        public java.util.List<ListUserAnalyzersResponseBodyResultDicts> dicts;

        /**
         * <p>The ID of the custom analyzer.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the custom analyzer.</p>
         * 
         * <strong>example:</strong>
         * <p>kevin_test2</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The timestamp when the application was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1588054131</p>
         */
        @NameInMap("updated")
        public Integer updated;

        public static ListUserAnalyzersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListUserAnalyzersResponseBodyResult self = new ListUserAnalyzersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListUserAnalyzersResponseBodyResult setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListUserAnalyzersResponseBodyResult setBusiness(String business) {
            this.business = business;
            return this;
        }
        public String getBusiness() {
            return this.business;
        }

        public ListUserAnalyzersResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListUserAnalyzersResponseBodyResult setDicts(java.util.List<ListUserAnalyzersResponseBodyResultDicts> dicts) {
            this.dicts = dicts;
            return this;
        }
        public java.util.List<ListUserAnalyzersResponseBodyResultDicts> getDicts() {
            return this.dicts;
        }

        public ListUserAnalyzersResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUserAnalyzersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListUserAnalyzersResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

    }

}
