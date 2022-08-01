// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateEtlMetaRequest extends TeaModel {
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

    public static UpdateEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEtlMetaRequest self = new UpdateEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEtlMetaRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateEtlMetaRequest setEtlMetaKey(String etlMetaKey) {
        this.etlMetaKey = etlMetaKey;
        return this;
    }
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    public UpdateEtlMetaRequest setEtlMetaName(String etlMetaName) {
        this.etlMetaName = etlMetaName;
        return this;
    }
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    public UpdateEtlMetaRequest setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    public UpdateEtlMetaRequest setEtlMetaValue(java.util.Map<String, ?> etlMetaValue) {
        this.etlMetaValue = etlMetaValue;
        return this;
    }
    public java.util.Map<String, ?> getEtlMetaValue() {
        return this.etlMetaValue;
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
