// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class PreCheckSqlFlashbackTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public PreCheckSqlFlashbackTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successs</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>14036EBE-***-44DB-ACE9-AC6157D3A6FC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
        @NameInMap("BinlogExists")
        public Boolean binlogExists;

        @NameInMap("BinlogRowQueryEventEnabled")
        public Boolean binlogRowQueryEventEnabled;

        @NameInMap("CanUpgradeSupportBinlogRowQueryEvents")
        public Boolean canUpgradeSupportBinlogRowQueryEvents;

        @NameInMap("HasTable")
        public Boolean hasTable;

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
