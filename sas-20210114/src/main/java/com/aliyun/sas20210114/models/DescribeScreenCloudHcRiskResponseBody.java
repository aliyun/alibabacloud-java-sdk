// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenCloudHcRiskResponseBody extends TeaModel {
    @NameInMap("CloudHcRiskItems")
    public java.util.List<DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems> cloudHcRiskItems;

    /**
     * <strong>example:</strong>
     * <p>0C8487EF-50C2-54BB-8634-10F8C35D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScreenCloudHcRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenCloudHcRiskResponseBody self = new DescribeScreenCloudHcRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenCloudHcRiskResponseBody setCloudHcRiskItems(java.util.List<DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems> cloudHcRiskItems) {
        this.cloudHcRiskItems = cloudHcRiskItems;
        return this;
    }
    public java.util.List<DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems> getCloudHcRiskItems() {
        return this.cloudHcRiskItems;
    }

    public DescribeScreenCloudHcRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("AffectCount")
        public Integer affectCount;

        /**
         * <strong>example:</strong>
         * <p>OSS-PublicReadOpenManifestFileWithoutEncryption</p>
         */
        @NameInMap("CheckItem")
        public String checkItem;

        /**
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("Pass")
        public Boolean pass;

        public static DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems self = new DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems();
            return TeaModel.build(map, self);
        }

        public DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems setAffectCount(Integer affectCount) {
            this.affectCount = affectCount;
            return this;
        }
        public Integer getAffectCount() {
            return this.affectCount;
        }

        public DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems setCheckItem(String checkItem) {
            this.checkItem = checkItem;
            return this;
        }
        public String getCheckItem() {
            return this.checkItem;
        }

        public DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeScreenCloudHcRiskResponseBodyCloudHcRiskItems setPass(Boolean pass) {
            this.pass = pass;
            return this;
        }
        public Boolean getPass() {
            return this.pass;
        }

    }

}
