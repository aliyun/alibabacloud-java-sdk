// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class UpgradeCDCVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpgradeCDCVersionResponseBodyData data;

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
     * <p>CB4307F5-3D04-51E8-ABAD-49E0B3F962FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpgradeCDCVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeCDCVersionResponseBody self = new UpgradeCDCVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeCDCVersionResponseBody setData(UpgradeCDCVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpgradeCDCVersionResponseBodyData getData() {
        return this.data;
    }

    public UpgradeCDCVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradeCDCVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeCDCVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpgradeCDCVersionResponseBodyDataTaskList extends TeaModel {
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

        public static UpgradeCDCVersionResponseBodyDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            UpgradeCDCVersionResponseBodyDataTaskList self = new UpgradeCDCVersionResponseBodyDataTaskList();
            return TeaModel.build(map, self);
        }

        public UpgradeCDCVersionResponseBodyDataTaskList setDbInstanceName(String dbInstanceName) {
            this.dbInstanceName = dbInstanceName;
            return this;
        }
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        public UpgradeCDCVersionResponseBodyDataTaskList setTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }
        public Integer getTaskId() {
            return this.taskId;
        }

    }

    public static class UpgradeCDCVersionResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>polardb-2.4.0_5.4.19-20250116_xcluster5.4.20-20241213</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("TaskList")
        public java.util.List<UpgradeCDCVersionResponseBodyDataTaskList> taskList;

        public static UpgradeCDCVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpgradeCDCVersionResponseBodyData self = new UpgradeCDCVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpgradeCDCVersionResponseBodyData setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public UpgradeCDCVersionResponseBodyData setTaskList(java.util.List<UpgradeCDCVersionResponseBodyDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<UpgradeCDCVersionResponseBodyDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}
