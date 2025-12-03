// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20210114.models;

import com.aliyun.tea.*;

public class DescribeScreenEmerRiskResponseBody extends TeaModel {
    @NameInMap("CloudHcRiskItems")
    public java.util.List<DescribeScreenEmerRiskResponseBodyCloudHcRiskItems> cloudHcRiskItems;

    /**
     * <strong>example:</strong>
     * <p>23AD0BD2-8771-5647-819E-6xxxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeScreenEmerRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScreenEmerRiskResponseBody self = new DescribeScreenEmerRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScreenEmerRiskResponseBody setCloudHcRiskItems(java.util.List<DescribeScreenEmerRiskResponseBodyCloudHcRiskItems> cloudHcRiskItems) {
        this.cloudHcRiskItems = cloudHcRiskItems;
        return this;
    }
    public java.util.List<DescribeScreenEmerRiskResponseBodyCloudHcRiskItems> getCloudHcRiskItems() {
        return this.cloudHcRiskItems;
    }

    public DescribeScreenEmerRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeScreenEmerRiskResponseBodyCloudHcRiskItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AffectCount")
        public Integer affectCount;

        /**
         * <strong>example:</strong>
         * <p>ASAP</p>
         */
        @NameInMap("Level")
        public String level;

        @NameInMap("VulName")
        public String vulName;

        public static DescribeScreenEmerRiskResponseBodyCloudHcRiskItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeScreenEmerRiskResponseBodyCloudHcRiskItems self = new DescribeScreenEmerRiskResponseBodyCloudHcRiskItems();
            return TeaModel.build(map, self);
        }

        public DescribeScreenEmerRiskResponseBodyCloudHcRiskItems setAffectCount(Integer affectCount) {
            this.affectCount = affectCount;
            return this;
        }
        public Integer getAffectCount() {
            return this.affectCount;
        }

        public DescribeScreenEmerRiskResponseBodyCloudHcRiskItems setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeScreenEmerRiskResponseBodyCloudHcRiskItems setVulName(String vulName) {
            this.vulName = vulName;
            return this;
        }
        public String getVulName() {
            return this.vulName;
        }

    }

}
