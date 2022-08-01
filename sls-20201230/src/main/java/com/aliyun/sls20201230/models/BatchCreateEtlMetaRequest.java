// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class BatchCreateEtlMetaRequest extends TeaModel {
    @NameInMap("etlMetaList")
    public java.util.List<BatchCreateEtlMetaRequestEtlMetaList> etlMetaList;

    public static BatchCreateEtlMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateEtlMetaRequest self = new BatchCreateEtlMetaRequest();
        return TeaModel.build(map, self);
    }

    public BatchCreateEtlMetaRequest setEtlMetaList(java.util.List<BatchCreateEtlMetaRequestEtlMetaList> etlMetaList) {
        this.etlMetaList = etlMetaList;
        return this;
    }
    public java.util.List<BatchCreateEtlMetaRequestEtlMetaList> getEtlMetaList() {
        return this.etlMetaList;
    }

    public static class BatchCreateEtlMetaRequestEtlMetaList extends TeaModel {
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

        public static BatchCreateEtlMetaRequestEtlMetaList build(java.util.Map<String, ?> map) throws Exception {
            BatchCreateEtlMetaRequestEtlMetaList self = new BatchCreateEtlMetaRequestEtlMetaList();
            return TeaModel.build(map, self);
        }

        public BatchCreateEtlMetaRequestEtlMetaList setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public BatchCreateEtlMetaRequestEtlMetaList setEtlMetaKey(String etlMetaKey) {
            this.etlMetaKey = etlMetaKey;
            return this;
        }
        public String getEtlMetaKey() {
            return this.etlMetaKey;
        }

        public BatchCreateEtlMetaRequestEtlMetaList setEtlMetaName(String etlMetaName) {
            this.etlMetaName = etlMetaName;
            return this;
        }
        public String getEtlMetaName() {
            return this.etlMetaName;
        }

        public BatchCreateEtlMetaRequestEtlMetaList setEtlMetaTag(String etlMetaTag) {
            this.etlMetaTag = etlMetaTag;
            return this;
        }
        public String getEtlMetaTag() {
            return this.etlMetaTag;
        }

        public BatchCreateEtlMetaRequestEtlMetaList setEtlMetaValue(java.util.Map<String, ?> etlMetaValue) {
            this.etlMetaValue = etlMetaValue;
            return this;
        }
        public java.util.Map<String, ?> getEtlMetaValue() {
            return this.etlMetaValue;
        }

    }

}
