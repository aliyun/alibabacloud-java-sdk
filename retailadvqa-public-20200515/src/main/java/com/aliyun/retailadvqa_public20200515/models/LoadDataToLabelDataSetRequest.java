// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class LoadDataToLabelDataSetRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("ColNameList")
    public java.util.List<String> colNameList;

    @NameInMap("CubeId")
    public String cubeId;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("Separator")
    public String separator;

    public static LoadDataToLabelDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadDataToLabelDataSetRequest self = new LoadDataToLabelDataSetRequest();
        return TeaModel.build(map, self);
    }

    public LoadDataToLabelDataSetRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public LoadDataToLabelDataSetRequest setColNameList(java.util.List<String> colNameList) {
        this.colNameList = colNameList;
        return this;
    }
    public java.util.List<String> getColNameList() {
        return this.colNameList;
    }

    public LoadDataToLabelDataSetRequest setCubeId(String cubeId) {
        this.cubeId = cubeId;
        return this;
    }
    public String getCubeId() {
        return this.cubeId;
    }

    public LoadDataToLabelDataSetRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public LoadDataToLabelDataSetRequest setSeparator(String separator) {
        this.separator = separator;
        return this;
    }
    public String getSeparator() {
        return this.separator;
    }

}
