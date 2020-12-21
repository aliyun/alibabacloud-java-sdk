// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonListShrinkRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("FaceUrl")
    public String faceUrl;

    @NameInMap("CorpIdList")
    public String corpIdListShrink;

    @NameInMap("FaceMatchingRateThreshold")
    public String faceMatchingRateThreshold;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PersonIdList")
    public String personIdListShrink;

    public static GetPersonListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPersonListShrinkRequest self = new GetPersonListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPersonListShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetPersonListShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetPersonListShrinkRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public GetPersonListShrinkRequest setCorpIdListShrink(String corpIdListShrink) {
        this.corpIdListShrink = corpIdListShrink;
        return this;
    }
    public String getCorpIdListShrink() {
        return this.corpIdListShrink;
    }

    public GetPersonListShrinkRequest setFaceMatchingRateThreshold(String faceMatchingRateThreshold) {
        this.faceMatchingRateThreshold = faceMatchingRateThreshold;
        return this;
    }
    public String getFaceMatchingRateThreshold() {
        return this.faceMatchingRateThreshold;
    }

    public GetPersonListShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetPersonListShrinkRequest setPersonIdListShrink(String personIdListShrink) {
        this.personIdListShrink = personIdListShrink;
        return this;
    }
    public String getPersonIdListShrink() {
        return this.personIdListShrink;
    }

}
