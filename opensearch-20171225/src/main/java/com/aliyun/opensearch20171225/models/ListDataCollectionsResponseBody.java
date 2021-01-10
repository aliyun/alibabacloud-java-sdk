// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ListDataCollectionsResponseBody extends TeaModel {
    @NameInMap("result")
    public java.util.List<ListDataCollectionsResponseBodyResult> result;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListDataCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataCollectionsResponseBody self = new ListDataCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataCollectionsResponseBody setResult(java.util.List<ListDataCollectionsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListDataCollectionsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListDataCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataCollectionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDataCollectionsResponseBodyResult extends TeaModel {
        @NameInMap("created")
        public Integer created;

        @NameInMap("dataCollectionType")
        public String dataCollectionType;

        @NameInMap("type")
        public String type;

        @NameInMap("industryName")
        public String industryName;

        @NameInMap("status")
        public Integer status;

        @NameInMap("updated")
        public Integer updated;

        @NameInMap("name")
        public String name;

        @NameInMap("sundialId")
        public String sundialId;

        @NameInMap("id")
        public String id;

        public static ListDataCollectionsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDataCollectionsResponseBodyResult self = new ListDataCollectionsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDataCollectionsResponseBodyResult setCreated(Integer created) {
            this.created = created;
            return this;
        }
        public Integer getCreated() {
            return this.created;
        }

        public ListDataCollectionsResponseBodyResult setDataCollectionType(String dataCollectionType) {
            this.dataCollectionType = dataCollectionType;
            return this;
        }
        public String getDataCollectionType() {
            return this.dataCollectionType;
        }

        public ListDataCollectionsResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListDataCollectionsResponseBodyResult setIndustryName(String industryName) {
            this.industryName = industryName;
            return this;
        }
        public String getIndustryName() {
            return this.industryName;
        }

        public ListDataCollectionsResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListDataCollectionsResponseBodyResult setUpdated(Integer updated) {
            this.updated = updated;
            return this;
        }
        public Integer getUpdated() {
            return this.updated;
        }

        public ListDataCollectionsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataCollectionsResponseBodyResult setSundialId(String sundialId) {
            this.sundialId = sundialId;
            return this;
        }
        public String getSundialId() {
            return this.sundialId;
        }

        public ListDataCollectionsResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
