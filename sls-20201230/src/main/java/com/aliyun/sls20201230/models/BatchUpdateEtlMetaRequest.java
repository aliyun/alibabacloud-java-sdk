// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class BatchUpdateEtlMetaRequest extends TeaModel {
    @NameInMap("etlMetaList")
    public BatchUpdateEtlMetaRequestEtlMetaList etlMetaList;

    public static BatchUpdateEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateEtlMetaRequest self = new BatchUpdateEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateEtlMetaRequest setEtlMetaList(BatchUpdateEtlMetaRequestEtlMetaList etlMetaList) {
        this.etlMetaList = etlMetaList;
        return this;
    }
    public BatchUpdateEtlMetaRequestEtlMetaList getEtlMetaList() {
        return this.etlMetaList;
    }

    public static class BatchUpdateEtlMetaRequestEtlMetaList extends TeaModel {
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("etlMetaKey")
        public String etlMetaKey;

        @NameInMap("etlMetaName")
        public String etlMetaName;

        @NameInMap("etlMetaTag")
        public String etlMetaTag;

        @NameInMap("etlMetaValue")
        public java.util.Map<String, ?> etlMetaValue;

        public static BatchUpdateEtlMetaRequestEtlMetaList build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateEtlMetaRequestEtlMetaList self = new BatchUpdateEtlMetaRequestEtlMetaList();
            return TeaModel.build(map, self);
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaKey(String etlMetaKey) {
            this.etlMetaKey = etlMetaKey;
            return this;
        }
        public String getEtlMetaKey() {
            return this.etlMetaKey;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaName(String etlMetaName) {
            this.etlMetaName = etlMetaName;
            return this;
        }
        public String getEtlMetaName() {
            return this.etlMetaName;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaTag(String etlMetaTag) {
            this.etlMetaTag = etlMetaTag;
            return this;
        }
        public String getEtlMetaTag() {
            return this.etlMetaTag;
        }

        public BatchUpdateEtlMetaRequestEtlMetaList setEtlMetaValue(java.util.Map<String, ?> etlMetaValue) {
            this.etlMetaValue = etlMetaValue;
            return this;
        }
        public java.util.Map<String, ?> getEtlMetaValue() {
            return this.etlMetaValue;
        }

    }

}
