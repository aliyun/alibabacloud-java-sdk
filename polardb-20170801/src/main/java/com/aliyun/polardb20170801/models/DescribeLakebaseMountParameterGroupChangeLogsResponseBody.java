// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeLakebaseMountParameterGroupChangeLogsResponseBody extends TeaModel {
    /**
     * <p>The change records, sorted in descending order by CreateTime. An empty array is returned if no data is found.</p>
     */
    @NameInMap("ChangeLogs")
    public java.util.List<DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs> changeLogs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F45FFACC-xxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLakebaseMountParameterGroupChangeLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLakebaseMountParameterGroupChangeLogsResponseBody self = new DescribeLakebaseMountParameterGroupChangeLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLakebaseMountParameterGroupChangeLogsResponseBody setChangeLogs(java.util.List<DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs> changeLogs) {
        this.changeLogs = changeLogs;
        return this;
    }
    public java.util.List<DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs> getChangeLogs() {
        return this.changeLogs;
    }

    public DescribeLakebaseMountParameterGroupChangeLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs extends TeaModel {
        /**
         * <p>The change type. Valid values: create, modify, and delete.</p>
         * 
         * <strong>example:</strong>
         * <p>modify</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The creation time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-07T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The ID of the user who performed the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Indicates whether the change has been applied. Valid values: 0 (no) and 1 (yes).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsApply")
        public String isApply;

        /**
         * <p>The modification time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-08T12:00:00Z</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The new value after the change. This parameter is empty for delete operations.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NewValue")
        public String newValue;

        /**
         * <p>The old value before the change. This parameter is empty for create operations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OldValue")
        public String oldValue;

        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_increment_offset</p>
         */
        @NameInMap("ParameterName")
        public String parameterName;

        public static DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs self = new DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs();
            return TeaModel.build(map, self);
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setIsApply(String isApply) {
            this.isApply = isApply;
            return this;
        }
        public String getIsApply() {
            return this.isApply;
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setNewValue(String newValue) {
            this.newValue = newValue;
            return this;
        }
        public String getNewValue() {
            return this.newValue;
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public DescribeLakebaseMountParameterGroupChangeLogsResponseBodyChangeLogs setParameterName(String parameterName) {
            this.parameterName = parameterName;
            return this;
        }
        public String getParameterName() {
            return this.parameterName;
        }

    }

}
