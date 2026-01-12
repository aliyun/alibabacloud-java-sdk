// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class CreateProjectRequest extends TeaModel {
    @NameInMap("AutoBuild")
    public Boolean autoBuild;

    @NameInMap("Dependencies")
    public String dependencies;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("Gender")
    public String gender;

    @NameInMap("Height")
    public Double height;

    @NameInMap("Intro")
    public String intro;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MapUuid")
    public String mapUuid;

    @NameInMap("Method")
    public String method;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("Title")
    public String title;

    @NameInMap("TryOnParams")
    public CreateProjectRequestTryOnParams tryOnParams;

    @NameInMap("Type")
    public String type;

    @NameInMap("Weight")
    public Double weight;

    public static CreateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRequest self = new CreateProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateProjectRequest setAutoBuild(Boolean autoBuild) {
        this.autoBuild = autoBuild;
        return this;
    }
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    public CreateProjectRequest setDependencies(String dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public String getDependencies() {
        return this.dependencies;
    }

    public CreateProjectRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public CreateProjectRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public CreateProjectRequest setHeight(Double height) {
        this.height = height;
        return this;
    }
    public Double getHeight() {
        return this.height;
    }

    public CreateProjectRequest setIntro(String intro) {
        this.intro = intro;
        return this;
    }
    public String getIntro() {
        return this.intro;
    }

    public CreateProjectRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public CreateProjectRequest setMapUuid(String mapUuid) {
        this.mapUuid = mapUuid;
        return this;
    }
    public String getMapUuid() {
        return this.mapUuid;
    }

    public CreateProjectRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public CreateProjectRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public CreateProjectRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateProjectRequest setTryOnParams(CreateProjectRequestTryOnParams tryOnParams) {
        this.tryOnParams = tryOnParams;
        return this;
    }
    public CreateProjectRequestTryOnParams getTryOnParams() {
        return this.tryOnParams;
    }

    public CreateProjectRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateProjectRequest setWeight(Double weight) {
        this.weight = weight;
        return this;
    }
    public Double getWeight() {
        return this.weight;
    }

    public static class CreateProjectRequestTryOnParamsClothInfos extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Size")
        public String size;

        @NameInMap("Status")
        public String status;

        public static CreateProjectRequestTryOnParamsClothInfos build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTryOnParamsClothInfos self = new CreateProjectRequestTryOnParamsClothInfos();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTryOnParamsClothInfos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateProjectRequestTryOnParamsClothInfos setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public CreateProjectRequestTryOnParamsClothInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateProjectRequestTryOnParams extends TeaModel {
        @NameInMap("ClothIds")
        public java.util.List<Long> clothIds;

        @NameInMap("ClothInfos")
        public java.util.List<CreateProjectRequestTryOnParamsClothInfos> clothInfos;

        public static CreateProjectRequestTryOnParams build(java.util.Map<String, ?> map) throws Exception {
            CreateProjectRequestTryOnParams self = new CreateProjectRequestTryOnParams();
            return TeaModel.build(map, self);
        }

        public CreateProjectRequestTryOnParams setClothIds(java.util.List<Long> clothIds) {
            this.clothIds = clothIds;
            return this;
        }
        public java.util.List<Long> getClothIds() {
            return this.clothIds;
        }

        public CreateProjectRequestTryOnParams setClothInfos(java.util.List<CreateProjectRequestTryOnParamsClothInfos> clothInfos) {
            this.clothInfos = clothInfos;
            return this;
        }
        public java.util.List<CreateProjectRequestTryOnParamsClothInfos> getClothInfos() {
            return this.clothInfos;
        }

    }

}
