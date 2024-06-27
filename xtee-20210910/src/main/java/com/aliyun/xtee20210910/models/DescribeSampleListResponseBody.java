// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSampleListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeSampleListResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeSampleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSampleListResponseBody self = new DescribeSampleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSampleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSampleListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSampleListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSampleListResponseBody setResultObject(java.util.List<DescribeSampleListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeSampleListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeSampleListResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeSampleListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSampleListResponseBodyResultObject extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("sampleTags")
        public String sampleTags;

        @NameInMap("sampleType")
        public Integer sampleType;

        @NameInMap("sampleValue")
        public String sampleValue;

        @NameInMap("updateTime")
        public Long updateTime;

        @NameInMap("version")
        public Integer version;

        public static DescribeSampleListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeSampleListResponseBodyResultObject self = new DescribeSampleListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeSampleListResponseBodyResultObject setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSampleListResponseBodyResultObject setSampleTags(String sampleTags) {
            this.sampleTags = sampleTags;
            return this;
        }
        public String getSampleTags() {
            return this.sampleTags;
        }

        public DescribeSampleListResponseBodyResultObject setSampleType(Integer sampleType) {
            this.sampleType = sampleType;
            return this;
        }
        public Integer getSampleType() {
            return this.sampleType;
        }

        public DescribeSampleListResponseBodyResultObject setSampleValue(String sampleValue) {
            this.sampleValue = sampleValue;
            return this;
        }
        public String getSampleValue() {
            return this.sampleValue;
        }

        public DescribeSampleListResponseBodyResultObject setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeSampleListResponseBodyResultObject setVersion(Integer version) {
            this.version = version;
            return this;
        }
        public Integer getVersion() {
            return this.version;
        }

    }

}
