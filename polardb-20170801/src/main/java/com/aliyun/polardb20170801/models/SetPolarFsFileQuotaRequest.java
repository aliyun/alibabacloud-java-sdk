// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SetPolarFsFileQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FilePathQuotas")
    public java.util.List<SetPolarFsFileQuotaRequestFilePathQuotas> filePathQuotas;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    public static SetPolarFsFileQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPolarFsFileQuotaRequest self = new SetPolarFsFileQuotaRequest();
        return TeaModel.build(map, self);
    }

    public SetPolarFsFileQuotaRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SetPolarFsFileQuotaRequest setFilePathQuotas(java.util.List<SetPolarFsFileQuotaRequestFilePathQuotas> filePathQuotas) {
        this.filePathQuotas = filePathQuotas;
        return this;
    }
    public java.util.List<SetPolarFsFileQuotaRequestFilePathQuotas> getFilePathQuotas() {
        return this.filePathQuotas;
    }

    public SetPolarFsFileQuotaRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static class SetPolarFsFileQuotaRequestFilePathQuotas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/a/project</p>
         */
        @NameInMap("FilePathId")
        public String filePathId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxDepth")
        public Integer maxDepth;

        /**
         * <strong>example:</strong>
         * <p>1,2</p>
         */
        @NameInMap("QuotaIds")
        public String quotaIds;

        /**
         * <strong>example:</strong>
         * <p>missing</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        public static SetPolarFsFileQuotaRequestFilePathQuotas build(java.util.Map<String, ?> map) throws Exception {
            SetPolarFsFileQuotaRequestFilePathQuotas self = new SetPolarFsFileQuotaRequestFilePathQuotas();
            return TeaModel.build(map, self);
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setFilePathId(String filePathId) {
            this.filePathId = filePathId;
            return this;
        }
        public String getFilePathId() {
            return this.filePathId;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setMaxDepth(Integer maxDepth) {
            this.maxDepth = maxDepth;
            return this;
        }
        public Integer getMaxDepth() {
            return this.maxDepth;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setQuotaIds(String quotaIds) {
            this.quotaIds = quotaIds;
            return this;
        }
        public String getQuotaIds() {
            return this.quotaIds;
        }

        public SetPolarFsFileQuotaRequestFilePathQuotas setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

    }

}
