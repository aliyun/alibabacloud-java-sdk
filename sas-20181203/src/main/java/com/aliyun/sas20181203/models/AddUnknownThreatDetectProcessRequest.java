// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddUnknownThreatDetectProcessRequest extends TeaModel {
    @NameInMap("EventIdList")
    public java.util.List<Long> eventIdList;

    @NameInMap("ProcessList")
    public java.util.List<AddUnknownThreatDetectProcessRequestProcessList> processList;

    @NameInMap("UuidList")
    public java.util.List<String> uuidList;

    public static AddUnknownThreatDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUnknownThreatDetectProcessRequest self = new AddUnknownThreatDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public AddUnknownThreatDetectProcessRequest setEventIdList(java.util.List<Long> eventIdList) {
        this.eventIdList = eventIdList;
        return this;
    }
    public java.util.List<Long> getEventIdList() {
        return this.eventIdList;
    }

    public AddUnknownThreatDetectProcessRequest setProcessList(java.util.List<AddUnknownThreatDetectProcessRequestProcessList> processList) {
        this.processList = processList;
        return this;
    }
    public java.util.List<AddUnknownThreatDetectProcessRequestProcessList> getProcessList() {
        return this.processList;
    }

    public AddUnknownThreatDetectProcessRequest setUuidList(java.util.List<String> uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static class AddUnknownThreatDetectProcessRequestProcessList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>e59b63ae983377f131ab20ec0d******</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <strong>example:</strong>
         * <p>/bin/rm</p>
         */
        @NameInMap("ProcessPath")
        public String processPath;

        /**
         * <strong>example:</strong>
         * <p>1330</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>f204693a7d2ce99d6c4434e550d985ee1c7be7cb5dd9a76094369af0d2******</p>
         */
        @NameInMap("Sha256")
        public String sha256;

        public static AddUnknownThreatDetectProcessRequestProcessList build(java.util.Map<String, ?> map) throws Exception {
            AddUnknownThreatDetectProcessRequestProcessList self = new AddUnknownThreatDetectProcessRequestProcessList();
            return TeaModel.build(map, self);
        }

        public AddUnknownThreatDetectProcessRequestProcessList setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public AddUnknownThreatDetectProcessRequestProcessList setProcessPath(String processPath) {
            this.processPath = processPath;
            return this;
        }
        public String getProcessPath() {
            return this.processPath;
        }

        public AddUnknownThreatDetectProcessRequestProcessList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public AddUnknownThreatDetectProcessRequestProcessList setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

    }

}
