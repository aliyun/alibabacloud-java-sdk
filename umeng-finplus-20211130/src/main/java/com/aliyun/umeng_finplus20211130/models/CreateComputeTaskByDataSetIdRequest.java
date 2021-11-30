// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20211130.models;

import com.aliyun.tea.*;

public class CreateComputeTaskByDataSetIdRequest extends TeaModel {
    @NameInMap("BatchInfoForm")
    public java.util.List<CreateComputeTaskByDataSetIdRequestBatchInfoForm> batchInfoForm;

    @NameInMap("DatasetId")
    public Long datasetId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remarks")
    public String remarks;

    public static CreateComputeTaskByDataSetIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskByDataSetIdRequest self = new CreateComputeTaskByDataSetIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskByDataSetIdRequest setBatchInfoForm(java.util.List<CreateComputeTaskByDataSetIdRequestBatchInfoForm> batchInfoForm) {
        this.batchInfoForm = batchInfoForm;
        return this;
    }
    public java.util.List<CreateComputeTaskByDataSetIdRequestBatchInfoForm> getBatchInfoForm() {
        return this.batchInfoForm;
    }

    public CreateComputeTaskByDataSetIdRequest setDatasetId(Long datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public Long getDatasetId() {
        return this.datasetId;
    }

    public CreateComputeTaskByDataSetIdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputeTaskByDataSetIdRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public static class CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions extends TeaModel {
        @NameInMap("CuId")
        public String cuId;

        @NameInMap("CuVersion")
        public String cuVersion;

        public static CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions self = new CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions();
            return TeaModel.build(map, self);
        }

        public CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions setCuId(String cuId) {
            this.cuId = cuId;
            return this;
        }
        public String getCuId() {
            return this.cuId;
        }

        public CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions setCuVersion(String cuVersion) {
            this.cuVersion = cuVersion;
            return this;
        }
        public String getCuVersion() {
            return this.cuVersion;
        }

    }

    public static class CreateComputeTaskByDataSetIdRequestBatchInfoForm extends TeaModel {
        @NameInMap("AppId")
        public Long appId;

        @NameInMap("CuVersions")
        public java.util.List<CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions> cuVersions;

        public static CreateComputeTaskByDataSetIdRequestBatchInfoForm build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeTaskByDataSetIdRequestBatchInfoForm self = new CreateComputeTaskByDataSetIdRequestBatchInfoForm();
            return TeaModel.build(map, self);
        }

        public CreateComputeTaskByDataSetIdRequestBatchInfoForm setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public CreateComputeTaskByDataSetIdRequestBatchInfoForm setCuVersions(java.util.List<CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions> cuVersions) {
            this.cuVersions = cuVersions;
            return this;
        }
        public java.util.List<CreateComputeTaskByDataSetIdRequestBatchInfoFormCuVersions> getCuVersions() {
            return this.cuVersions;
        }

    }

}
