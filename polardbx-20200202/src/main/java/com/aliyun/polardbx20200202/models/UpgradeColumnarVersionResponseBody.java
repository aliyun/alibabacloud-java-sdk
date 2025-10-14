// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeColumnarVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpgradeColumnarVersionResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AE4F6C34-****-45AA-B5DC-4B8D816F6305</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpgradeColumnarVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeColumnarVersionResponseBody self = new UpgradeColumnarVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeColumnarVersionResponseBody setData(UpgradeColumnarVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeColumnarVersionResponseBodyData getData() {
        return this.data;
    }

    public UpgradeColumnarVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeColumnarVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeColumnarVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeColumnarVersionResponseBodyDataTaskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rm-uf68f345****88zf8</p>
         */
        @NameInMap("DbInstanceName")
        public String dbInstanceName;

        /**
         * <strong>example:</strong>
         * <p>1861190497624654848</p>
         */
        @NameInMap("TaskId")
        public Integer taskId;

        public static UpgradeColumnarVersionResponseBodyDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            UpgradeColumnarVersionResponseBodyDataTaskList self = new UpgradeColumnarVersionResponseBodyDataTaskList();
            return TeaModel.build(map, self);
        }

        public UpgradeColumnarVersionResponseBodyDataTaskList setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public UpgradeColumnarVersionResponseBodyDataTaskList setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

    public static class UpgradeColumnarVersionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polardb-2.4.0_5.4.19-20250116_xcluster5.4.20-20241213</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("TaskList")
        public java.util.List<UpgradeColumnarVersionResponseBodyDataTaskList> taskList;

        public static UpgradeColumnarVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeColumnarVersionResponseBodyData self = new UpgradeColumnarVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeColumnarVersionResponseBodyData setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public UpgradeColumnarVersionResponseBodyData setTaskList(java.util.List<UpgradeColumnarVersionResponseBodyDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<UpgradeColumnarVersionResponseBodyDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}
