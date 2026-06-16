// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class PreCheckSqlFlashbackTaskResponseBody extends TeaModel {
    /**
     * <p>The result set.</p>
     */
    @NameInMap("Data")
    public PreCheckSqlFlashbackTaskResponseBodyData data;

    /**
     * <p>The response message. This parameter is empty when the request succeeds. If the request fails, an exception message is returned, such as an error code.</p>
     * 
     * <strong>example:</strong>
     * <p>successs</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>14036EBE-***-44DB-ACE9-AC6157D3A6FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PreCheckSqlFlashbackTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreCheckSqlFlashbackTaskResponseBody self = new PreCheckSqlFlashbackTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public PreCheckSqlFlashbackTaskResponseBody setData(PreCheckSqlFlashbackTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PreCheckSqlFlashbackTaskResponseBodyData getData() {
        return this.data;
    }

    public PreCheckSqlFlashbackTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreCheckSqlFlashbackTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreCheckSqlFlashbackTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PreCheckSqlFlashbackTaskResponseBodyDataCheckResult extends TeaModel {
        /**
         * <p>Indicates whether valid binary log files exist. This value is used to determine whether operations such as flashback and synchronization can be performed.</p>
         */
        @NameInMap("BinlogExists")
        public Boolean binlogExists;

        /**
         * <p>Indicates whether the recording of original SQL query events is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         */
        @NameInMap("BinlogRowQueryEventEnabled")
        public Boolean binlogRowQueryEventEnabled;

        /**
         * <p>Indicates whether the upgrade can succeed.</p>
         */
        @NameInMap("CanUpgradeSupportBinlogRowQueryEvents")
        public Boolean canUpgradeSupportBinlogRowQueryEvents;

        /**
         * <p>Indicates whether the table exists. Valid values: true and false.</p>
         */
        @NameInMap("HasTable")
        public Boolean hasTable;

        /**
         * <p>Indicates whether log recording is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         */
        @NameInMap("SupportBinlogRowQueryEvents")
        public Boolean supportBinlogRowQueryEvents;

        public static PreCheckSqlFlashbackTaskResponseBodyDataCheckResult build(java.util.Map<String, ?> map) throws Exception {
            PreCheckSqlFlashbackTaskResponseBodyDataCheckResult self = new PreCheckSqlFlashbackTaskResponseBodyDataCheckResult();
            return TeaModel.build(map, self);
        }

        public PreCheckSqlFlashbackTaskResponseBodyDataCheckResult setBinlogExists(Boolean binlogExists) {
            this.binlogExists = binlogExists;
            return this;
        }
        public Boolean getBinlogExists() {
            return this.binlogExists;
        }

        public PreCheckSqlFlashbackTaskResponseBodyDataCheckResult setBinlogRowQueryEventEnabled(Boolean binlogRowQueryEventEnabled) {
            this.binlogRowQueryEventEnabled = binlogRowQueryEventEnabled;
            return this;
        }
        public Boolean getBinlogRowQueryEventEnabled() {
            return this.binlogRowQueryEventEnabled;
        }

        public PreCheckSqlFlashbackTaskResponseBodyDataCheckResult setCanUpgradeSupportBinlogRowQueryEvents(Boolean canUpgradeSupportBinlogRowQueryEvents) {
            this.canUpgradeSupportBinlogRowQueryEvents = canUpgradeSupportBinlogRowQueryEvents;
            return this;
        }
        public Boolean getCanUpgradeSupportBinlogRowQueryEvents() {
            return this.canUpgradeSupportBinlogRowQueryEvents;
        }

        public PreCheckSqlFlashbackTaskResponseBodyDataCheckResult setHasTable(Boolean hasTable) {
            this.hasTable = hasTable;
            return this;
        }
        public Boolean getHasTable() {
            return this.hasTable;
        }

        public PreCheckSqlFlashbackTaskResponseBodyDataCheckResult setSupportBinlogRowQueryEvents(Boolean supportBinlogRowQueryEvents) {
            this.supportBinlogRowQueryEvents = supportBinlogRowQueryEvents;
            return this;
        }
        public Boolean getSupportBinlogRowQueryEvents() {
            return this.supportBinlogRowQueryEvents;
        }

    }

    public static class PreCheckSqlFlashbackTaskResponseBodyData extends TeaModel {
        /**
         * <p>The check result.</p>
         */
        @NameInMap("CheckResult")
        public PreCheckSqlFlashbackTaskResponseBodyDataCheckResult checkResult;

        public static PreCheckSqlFlashbackTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PreCheckSqlFlashbackTaskResponseBodyData self = new PreCheckSqlFlashbackTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PreCheckSqlFlashbackTaskResponseBodyData setCheckResult(PreCheckSqlFlashbackTaskResponseBodyDataCheckResult checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public PreCheckSqlFlashbackTaskResponseBodyDataCheckResult getCheckResult() {
            return this.checkResult;
        }

    }

}
