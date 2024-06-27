// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleSceneListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeSampleSceneListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSampleSceneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleSceneListResponseBody self = new DescribeSampleSceneListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleSceneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleSceneListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleSceneListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleSceneListResponseBody setResultObject(java.util.List<DescribeSampleSceneListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSampleSceneListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSampleSceneListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSampleSceneListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSampleSceneListResponseBodyResultObject extends TeaModel {
        @NameInMap("bizType")
        public String bizType;

        @NameInMap("configKey")
        public String configKey;

        @NameInMap("configValue")
        public String configValue;

        @NameInMap("creator")
        public String creator;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("gmtModified")
        public Long gmtModified;

        @NameInMap("id")
        public Long id;

        @NameInMap("lastModifiedOperator")
        public String lastModifiedOperator;

        @NameInMap("status")
        public String status;

        public static DescribeSampleSceneListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleSceneListResponseBodyResultObject self = new DescribeSampleSceneListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleSceneListResponseBodyResultObject setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeSampleSceneListResponseBodyResultObject setConfigKey(String configKey) {
            this.configKey = configKey;
            return this;
        }
        public String getConfigKey() {
            return this.configKey;
        }

        public DescribeSampleSceneListResponseBodyResultObject setConfigValue(String configValue) {
            this.configValue = configValue;
            return this;
        }
        public String getConfigValue() {
            return this.configValue;
        }

        public DescribeSampleSceneListResponseBodyResultObject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeSampleSceneListResponseBodyResultObject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSampleSceneListResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeSampleSceneListResponseBodyResultObject setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeSampleSceneListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSampleSceneListResponseBodyResultObject setLastModifiedOperator(String lastModifiedOperator) {
            this.lastModifiedOperator = lastModifiedOperator;
            return this;
        }
        public String getLastModifiedOperator() {
            return this.lastModifiedOperator;
        }

        public DescribeSampleSceneListResponseBodyResultObject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
