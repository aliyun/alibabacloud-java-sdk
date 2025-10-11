// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeModifyParameterLogResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>polardb_mysql</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("Items")
    public java.util.List<DescribeModifyParameterLogResponseBodyItems> items;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModifyParameterLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModifyParameterLogResponseBody self = new DescribeModifyParameterLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModifyParameterLogResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeModifyParameterLogResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeModifyParameterLogResponseBody setItems(java.util.List<DescribeModifyParameterLogResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeModifyParameterLogResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeModifyParameterLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeModifyParameterLogResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-10-29T09:31:37Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <strong>example:</strong>
         * <p>test01</p>
         */
        @NameInMap("NewParameterValue")
        public String newParameterValue;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        /**
         * <strong>example:</strong>
         * <p>hz</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeModifyParameterLogResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeModifyParameterLogResponseBodyItems self = new DescribeModifyParameterLogResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeModifyParameterLogResponseBodyItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeModifyParameterLogResponseBodyItems setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeModifyParameterLogResponseBodyItems setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeModifyParameterLogResponseBodyItems setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeModifyParameterLogResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
