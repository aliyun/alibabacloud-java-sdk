// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class GetFbOssConfigRequest extends TeaModel {
    @NameInMap("AreaSite")
    public String areaSite;

    @NameInMap("DirPrefix")
    public String dirPrefix;

    @NameInMap("IsDedicatedLine")
    public Integer isDedicatedLine;

    @NameInMap("Region")
    public String region;

    public static GetFbOssConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFbOssConfigRequest self = new GetFbOssConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetFbOssConfigRequest setAreaSite(String areaSite) {
        this.areaSite = areaSite;
        return this;
    }
    public String getAreaSite() {
        return this.areaSite;
    }

    public GetFbOssConfigRequest setDirPrefix(String dirPrefix) {
        this.dirPrefix = dirPrefix;
        return this;
    }
    public String getDirPrefix() {
        return this.dirPrefix;
    }

    public GetFbOssConfigRequest setIsDedicatedLine(Integer isDedicatedLine) {
        this.isDedicatedLine = isDedicatedLine;
        return this;
    }
    public Integer getIsDedicatedLine() {
        return this.isDedicatedLine;
    }

    public GetFbOssConfigRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
