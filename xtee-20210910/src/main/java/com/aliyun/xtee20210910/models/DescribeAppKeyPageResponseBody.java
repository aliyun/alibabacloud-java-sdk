// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAppKeyPageResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E01E1B4A-6747-5329-9046-B6D6B2D91349</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Number of items per page, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeAppKeyPageResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>Android SDK download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
         */
        @NameInMap("androidSdkUrl")
        public String androidSdkUrl;

        /**
         * <p>Android SDK version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("androidSdkVersion")
        public String androidSdkVersion;

        /**
         * <p>Application appkey.</p>
         * 
         * <strong>example:</strong>
         * <p>sh9a71f07fhs556bd767586307e82795</p>
         */
        @NameInMap("appKey")
        public String appKey;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1621578648000</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>iOS SDK download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&OSSAccessKeyId=xxxxxxxxx&Signature=%2F%xxxxxxxxxxxx%3D">https://xxxxx-oss-xxxxx.xxxxxx.aliyuncs.com/xx/xx/xxx/xxxxxx.csv?Expires=1753433384&amp;OSSAccessKeyId=xxxxxxxxx&amp;Signature=%2F%xxxxxxxxxxxx%3D</a></p>
         */
        @NameInMap("iosSdkUrl")
        public String iosSdkUrl;

        /**
         * <p>iOS SDK version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("iosSdkVersion")
        public String iosSdkVersion;

        /**
         * <p>Memo.</p>
         * 
         * <strong>example:</strong>
         * <p>备注</p>
         */
        @NameInMap("memo")
        public String memo;

        /**
         * <p>Deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>已作废</p>
         */
        @NameInMap("sdkItems")
        public String sdkItems;

        /**
         * <p>Whether this appKey is integrated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
