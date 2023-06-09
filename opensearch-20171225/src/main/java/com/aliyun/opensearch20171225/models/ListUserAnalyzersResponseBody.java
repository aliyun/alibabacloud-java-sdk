// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListUserAnalyzersResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The custom analyzer.</p>
     * <br>
     * <p>For more information, see [UserAnalyzer](~~178934~~).</p>
     */
    @NameInMap("result")
    public java.util.List<ListUserAnalyzersResponseBodyResult> result;

    /**
     * <p>The total number.</p>
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
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <p>The timestamp when the application was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The number of intervention entries.</p>
         */
        @NameInMap("entriesCount")
        public Integer entriesCount;

        /**
         * <p>The maximum number of intervention entries that can be created in the dictionary.</p>
         */
        @NameInMap("entriesLimit")
        public Integer entriesLimit;

        /**
         * <p>The ID of the dictionary.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The type. Valid value:</p>
         * <br>
         * <p>*   segment</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The timestamp when the application was last updated.</p>
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
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <p>The basic analyzer. Valid values:</p>
         * <br>
         * <p>*   chn_standard: [a common analyzer in Chinese](~~179424~~)</p>
         * <p>*   chn_scene_name: an analyzer for person names in Chinese</p>
         * <p>*   chn_ecommerce: [an analyzer for E-commerce in Chinese](~~179424~~)</p>
         * <p>*   chn_it_content: [an analyzer for IT content in Chinese](~~179424~~)</p>
         * <p>*   en_min: a small-granularity analyzer in English</p>
         * <p>*   th_standard: a common analyzer in Thai</p>
         * <p>*   th_ecommerce: an analyzer for E-commerce in Thai</p>
         * <p>*   vn_standard: a common analyzer in Vietnamese</p>
         * <p>*   chn_community_it: an analyzer for IT community content in Chinese</p>
         * <p>*   chn_ecommerce_general: a common analyzer for the E-commerce industry in Chinese</p>
         * <p>*   chn_esports_general: a common analyzer for the gaming industry in Chinese</p>
         * <p>*   chn_edu_question: an analyzer for question search of the education industry in Chinese</p>
         */
        @NameInMap("business")
        public String business;

        /**
         * <p>The timestamp when the application was created.</p>
         */
        @NameInMap("created")
        public Integer created;

        /**
         * <p>The dictionaries that are used by the custom analyzer.</p>
         * <br>
         * <p>For more information, see [UserDict](~~178933~~).</p>
         */
        @NameInMap("dicts")
        public java.util.List<ListUserAnalyzersResponseBodyResultDicts> dicts;

        /**
         * <p>The ID of the custom analyzer.</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the custom analyzer.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The timestamp when the application was last updated.</p>
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
