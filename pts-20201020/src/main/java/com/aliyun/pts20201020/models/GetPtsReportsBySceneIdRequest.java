// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetPtsReportsBySceneIdRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SceneId")
    public String sceneId;

    public static GetPtsReportsBySceneIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPtsReportsBySceneIdRequest self = new GetPtsReportsBySceneIdRequest();
        return TeaModel.build(map, self);
    }

    public GetPtsReportsBySceneIdRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetPtsReportsBySceneIdRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPtsReportsBySceneIdRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

}
