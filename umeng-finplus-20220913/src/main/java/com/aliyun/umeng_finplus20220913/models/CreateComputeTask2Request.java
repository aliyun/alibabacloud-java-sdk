// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateComputeTask2Request extends TeaModel {
    @NameInMap("appId")
    public Long appId;

    @NameInMap("clientId")
    public Long clientId;

    @NameInMap("dataSetIds")
    public String dataSetIds;

    @NameInMap("morseInfoList")
    public java.util.List<CreateComputeTask2RequestMorseInfoList> morseInfoList;

    @NameInMap("name")
    public String name;

    @NameInMap("remarks")
    public String remarks;

    @NameInMap("type")
    public String type;

    public static CreateComputeTask2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTask2Request self = new CreateComputeTask2Request();
        return TeaModel.build(map, self);
    }

    public CreateComputeTask2Request setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateComputeTask2Request setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public CreateComputeTask2Request setDataSetIds(String dataSetIds) {
        this.dataSetIds = dataSetIds;
        return this;
    }
    public String getDataSetIds() {
        return this.dataSetIds;
    }

    public CreateComputeTask2Request setMorseInfoList(java.util.List<CreateComputeTask2RequestMorseInfoList> morseInfoList) {
        this.morseInfoList = morseInfoList;
        return this;
    }
    public java.util.List<CreateComputeTask2RequestMorseInfoList> getMorseInfoList() {
        return this.morseInfoList;
    }

    public CreateComputeTask2Request setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputeTask2Request setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateComputeTask2Request setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateComputeTask2RequestMorseInfoList extends TeaModel {
        @NameInMap("cuId")
        public String cuId;

        @NameInMap("cuVersion")
        public String cuVersion;

        public static CreateComputeTask2RequestMorseInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeTask2RequestMorseInfoList self = new CreateComputeTask2RequestMorseInfoList();
            return TeaModel.build(map, self);
        }

        public CreateComputeTask2RequestMorseInfoList setCuId(String cuId) {
            this.cuId = cuId;
            return this;
        }
        public String getCuId() {
            return this.cuId;
        }

        public CreateComputeTask2RequestMorseInfoList setCuVersion(String cuVersion) {
            this.cuVersion = cuVersion;
            return this;
        }
        public String getCuVersion() {
            return this.cuVersion;
        }

    }

}
