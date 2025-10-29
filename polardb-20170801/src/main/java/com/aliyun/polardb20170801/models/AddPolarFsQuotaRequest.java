// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class AddPolarFsQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
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
    public java.util.List<AddPolarFsQuotaRequestQuotas> quotas;

    public static AddPolarFsQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPolarFsQuotaRequest self = new AddPolarFsQuotaRequest();
        return TeaModel.build(map, self);
    }

    public AddPolarFsQuotaRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public AddPolarFsQuotaRequest setPolarFsInstanceId(String polarFsInstanceId) {
        this.polarFsInstanceId = polarFsInstanceId;
        return this;
    }
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public AddPolarFsQuotaRequest setQuotas(java.util.List<AddPolarFsQuotaRequestQuotas> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<AddPolarFsQuotaRequestQuotas> getQuotas() {
        return this.quotas;
    }

    public static class AddPolarFsQuotaRequestQuotas extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("AccessTTL")
        public Long accessTTL;

        /**
         * <strong>example:</strong>
         * <p>7200</p>
         */
        @NameInMap("ChangeTTL")
        public Long changeTTL;

        /**
         * <strong>example:</strong>
         * <p>quota_policy</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <strong>example:</strong>
         * <p>/a/<em>project</em></p>
         */
        @NameInMap("Exclude")
        public String exclude;

        /**
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("FileCountLimit")
        public Long fileCountLimit;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/b/<em>project</em></p>
         */
        @NameInMap("Include")
        public String include;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rule1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SizeLimit")
        public Long sizeLimit;

        public static AddPolarFsQuotaRequestQuotas build(java.util.Map<String, ?> map) throws Exception {
            AddPolarFsQuotaRequestQuotas self = new AddPolarFsQuotaRequestQuotas();
            return TeaModel.build(map, self);
        }

        public AddPolarFsQuotaRequestQuotas setAccessTTL(Long accessTTL) {
            this.accessTTL = accessTTL;
            return this;
        }
        public Long getAccessTTL() {
            return this.accessTTL;
        }

        public AddPolarFsQuotaRequestQuotas setChangeTTL(Long changeTTL) {
            this.changeTTL = changeTTL;
            return this;
        }
        public Long getChangeTTL() {
            return this.changeTTL;
        }

        public AddPolarFsQuotaRequestQuotas setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AddPolarFsQuotaRequestQuotas setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AddPolarFsQuotaRequestQuotas setExclude(String exclude) {
            this.exclude = exclude;
            return this;
        }
        public String getExclude() {
            return this.exclude;
        }

        public AddPolarFsQuotaRequestQuotas setFileCountLimit(Long fileCountLimit) {
            this.fileCountLimit = fileCountLimit;
            return this;
        }
        public Long getFileCountLimit() {
            return this.fileCountLimit;
        }

        public AddPolarFsQuotaRequestQuotas setInclude(String include) {
            this.include = include;
            return this;
        }
        public String getInclude() {
            return this.include;
        }

        public AddPolarFsQuotaRequestQuotas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddPolarFsQuotaRequestQuotas setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public AddPolarFsQuotaRequestQuotas setSizeLimit(Long sizeLimit) {
            this.sizeLimit = sizeLimit;
            return this;
        }
        public Long getSizeLimit() {
            return this.sizeLimit;
        }

    }

}
