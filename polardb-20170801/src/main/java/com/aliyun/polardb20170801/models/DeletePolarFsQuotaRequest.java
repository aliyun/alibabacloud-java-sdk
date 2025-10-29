// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-2ze0i74ka607*****</p>
     */
    @NameInMap("PolarFsInstanceId")
    public String polarFsInstanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Quotas")
    public java.util.List<DeletePolarFsQuotaRequestQuotas> quotas;

    public static DeletePolarFsQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsQuotaRequest self = new DeletePolarFsQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsQuotaRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeletePolarFsQuotaRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public DeletePolarFsQuotaRequest setQuotas(java.util.List<DeletePolarFsQuotaRequestQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<DeletePolarFsQuotaRequestQuotas> getQuotas() {
        return this.quotas;
    }

    public static class DeletePolarFsQuotaRequestQuotas extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sftest</p>
         */
        @NameInMap("Name")
        public String name;

        public static DeletePolarFsQuotaRequestQuotas build(java.util.Map<String, ?> map) throws Exception {
            DeletePolarFsQuotaRequestQuotas self = new DeletePolarFsQuotaRequestQuotas();
            return TeaModel.build(map, self);
        }

        public DeletePolarFsQuotaRequestQuotas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DeletePolarFsQuotaRequestQuotas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
