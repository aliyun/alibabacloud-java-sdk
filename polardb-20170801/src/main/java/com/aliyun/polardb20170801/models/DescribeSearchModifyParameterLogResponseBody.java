// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSearchModifyParameterLogResponseBody extends TeaModel {
    /**
     * <p>The type of the Search engine.</p>
     * 
     * <strong>example:</strong>
     * <p>polardb_search</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The database engine version of the Search DPI engine. This is not the MySQL version of the primary cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>3.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The parameter modification history. The records are returned in descending order of record IDs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSearchModifyParameterLogResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>e3a24663-eee5-4009-b635-2e9e8d052e74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSearchModifyParameterLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSearchModifyParameterLogResponseBody self = new DescribeSearchModifyParameterLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSearchModifyParameterLogResponseBody setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeSearchModifyParameterLogResponseBody setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeSearchModifyParameterLogResponseBody setItems(java.util.List<DescribeSearchModifyParameterLogResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSearchModifyParameterLogResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSearchModifyParameterLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSearchModifyParameterLogResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the parameter was modified. The time is displayed in the yyyy-MM-ddTHH:mm:ssZ format in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T07:04:29Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The new value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("NewParameterValue")
        public String newParameterValue;

        /**
         * <p>The original value of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("OldParameterValue")
        public String oldParameterValue;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>http.compression_level</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        /**
         * <p>The modification status. Valid values:</p>
         * <ul>
         * <li>Syncing: The modification has not taken effect.</li>
         * <li>Applied: The modification has taken effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Applied</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeSearchModifyParameterLogResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSearchModifyParameterLogResponseBodyItems self = new DescribeSearchModifyParameterLogResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSearchModifyParameterLogResponseBodyItems setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeSearchModifyParameterLogResponseBodyItems setNewParameterValue(String newParameterValue) {
            this.newParameterValue = newParameterValue;
            return this;
        }
        public String getNewParameterValue() {
            return this.newParameterValue;
        }

        public DescribeSearchModifyParameterLogResponseBodyItems setOldParameterValue(String oldParameterValue) {
            this.oldParameterValue = oldParameterValue;
            return this;
        }
        public String getOldParameterValue() {
            return this.oldParameterValue;
        }

        public DescribeSearchModifyParameterLogResponseBodyItems setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

        public DescribeSearchModifyParameterLogResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
