// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonListRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("CorpIdList")
    public java.util.Map<String, ?> corpIdList;

    @NameInMap("FaceMatchingRateThreshold")
    public String faceMatchingRateThreshold;

    @NameInMap("FaceUrl")
    public String faceUrl;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PersonIdList")
    public java.util.Map<String, ?> personIdList;

    public static GetPersonListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPersonListRequest self = new GetPersonListRequest();
        return TeaModel.build(map, self);
    }

    public GetPersonListRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetPersonListRequest setCorpIdList(java.util.Map<String, ?> corpIdList) {
        this.corpIdList = corpIdList;
        return this;
    }
    public java.util.Map<String, ?> getCorpIdList() {
        return this.corpIdList;
    }

    public GetPersonListRequest setFaceMatchingRateThreshold(String faceMatchingRateThreshold) {
        this.faceMatchingRateThreshold = faceMatchingRateThreshold;
        return this;
    }
    public String getFaceMatchingRateThreshold() {
        return this.faceMatchingRateThreshold;
    }

    public GetPersonListRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public GetPersonListRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public GetPersonListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetPersonListRequest setPersonIdList(java.util.Map<String, ?> personIdList) {
        this.personIdList = personIdList;
        return this;
    }
    public java.util.Map<String, ?> getPersonIdList() {
        return this.personIdList;
    }

}
