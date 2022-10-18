// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_finplus20220913.models;

import com.aliyun.tea.*;

public class CreateComputeTaskRequest extends TeaModel {
    @NameInMap("appId")
    public Long appId;

    @NameInMap("dataSetIds")
    public String dataSetIds;

    @NameInMap("morseInfoList")
    public java.util.List<CreateComputeTaskRequestMorseInfoList> morseInfoList;

    @NameInMap("name")
    public String name;

    @NameInMap("remarks")
    public String remarks;

    @NameInMap("type")
    public String type;

    public static CreateComputeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeTaskRequest self = new CreateComputeTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateComputeTaskRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public CreateComputeTaskRequest setDataSetIds(String dataSetIds) {
        this.dataSetIds = dataSetIds;
        return this;
    }
    public String getDataSetIds() {
        return this.dataSetIds;
    }

    public CreateComputeTaskRequest setMorseInfoList(java.util.List<CreateComputeTaskRequestMorseInfoList> morseInfoList) {
        this.morseInfoList = morseInfoList;
        return this;
    }
    public java.util.List<CreateComputeTaskRequestMorseInfoList> getMorseInfoList() {
        return this.morseInfoList;
    }

    public CreateComputeTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateComputeTaskRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateComputeTaskRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateComputeTaskRequestMorseInfoList extends TeaModel {
        @NameInMap("cuId")
        public String cuId;

        @NameInMap("cuVersion")
        public String cuVersion;

        public static CreateComputeTaskRequestMorseInfoList build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeTaskRequestMorseInfoList self = new CreateComputeTaskRequestMorseInfoList();
            return TeaModel.build(map, self);
        }

        public CreateComputeTaskRequestMorseInfoList setCuId(String cuId) {
            this.cuId = cuId;
            return this;
        }
        public String getCuId() {
            return this.cuId;
        }

        public CreateComputeTaskRequestMorseInfoList setCuVersion(String cuVersion) {
            this.cuVersion = cuVersion;
            return this;
        }
        public String getCuVersion() {
            return this.cuVersion;
        }

    }

}
