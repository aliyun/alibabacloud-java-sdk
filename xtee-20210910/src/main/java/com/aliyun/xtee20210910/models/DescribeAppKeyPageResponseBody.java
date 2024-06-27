// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAppKeyPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeAppKeyPageResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeAppKeyPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppKeyPageResponseBody self = new DescribeAppKeyPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppKeyPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAppKeyPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAppKeyPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAppKeyPageResponseBody setResultObject(java.util.List<DescribeAppKeyPageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAppKeyPageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeAppKeyPageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeAppKeyPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeAppKeyPageResponseBodyResultObject extends TeaModel {
        @NameInMap("androidSdkUrl")
        public String androidSdkUrl;

        @NameInMap("androidSdkVersion")
        public String androidSdkVersion;

        @NameInMap("appKey")
        public String appKey;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("iosSdkUrl")
        public String iosSdkUrl;

        @NameInMap("iosSdkVersion")
        public String iosSdkVersion;

        @NameInMap("memo")
        public String memo;

        @NameInMap("sdkItems")
        public String sdkItems;

        @NameInMap("used")
        public String used;

        public static DescribeAppKeyPageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppKeyPageResponseBodyResultObject self = new DescribeAppKeyPageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAppKeyPageResponseBodyResultObject setAndroidSdkUrl(String androidSdkUrl) {
            this.androidSdkUrl = androidSdkUrl;
            return this;
        }
        public String getAndroidSdkUrl() {
            return this.androidSdkUrl;
        }

        public DescribeAppKeyPageResponseBodyResultObject setAndroidSdkVersion(String androidSdkVersion) {
            this.androidSdkVersion = androidSdkVersion;
            return this;
        }
        public String getAndroidSdkVersion() {
            return this.androidSdkVersion;
        }

        public DescribeAppKeyPageResponseBodyResultObject setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public DescribeAppKeyPageResponseBodyResultObject setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeAppKeyPageResponseBodyResultObject setIosSdkUrl(String iosSdkUrl) {
            this.iosSdkUrl = iosSdkUrl;
            return this;
        }
        public String getIosSdkUrl() {
            return this.iosSdkUrl;
        }

        public DescribeAppKeyPageResponseBodyResultObject setIosSdkVersion(String iosSdkVersion) {
            this.iosSdkVersion = iosSdkVersion;
            return this;
        }
        public String getIosSdkVersion() {
            return this.iosSdkVersion;
        }

        public DescribeAppKeyPageResponseBodyResultObject setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public DescribeAppKeyPageResponseBodyResultObject setSdkItems(String sdkItems) {
            this.sdkItems = sdkItems;
            return this;
        }
        public String getSdkItems() {
            return this.sdkItems;
        }

        public DescribeAppKeyPageResponseBodyResultObject setUsed(String used) {
            this.used = used;
            return this;
        }
        public String getUsed() {
            return this.used;
        }

    }

}
