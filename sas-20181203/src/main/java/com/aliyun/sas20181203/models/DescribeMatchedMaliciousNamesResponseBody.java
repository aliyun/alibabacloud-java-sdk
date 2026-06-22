// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeMatchedMaliciousNamesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page in a paged query. If paging is not used, this value indicates the total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeMatchedMaliciousNamesResponseBodyData> data;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>C7CD1BE6-97A2-5524-A529-B55C63E55D59</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMatchedMaliciousNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMatchedMaliciousNamesResponseBody self = new DescribeMatchedMaliciousNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMatchedMaliciousNamesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeMatchedMaliciousNamesResponseBody setData(java.util.List<DescribeMatchedMaliciousNamesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMatchedMaliciousNamesResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMatchedMaliciousNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMatchedMaliciousNamesResponseBodyData extends TeaModel {
        /**
         * <p>The display name of the malicious sample type.</p>
         * 
         * <strong>example:</strong>
         * <p>displayname</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The key of the malicious sample type.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        public static DescribeMatchedMaliciousNamesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMatchedMaliciousNamesResponseBodyData self = new DescribeMatchedMaliciousNamesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMatchedMaliciousNamesResponseBodyData setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeMatchedMaliciousNamesResponseBodyData setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

    }

}
