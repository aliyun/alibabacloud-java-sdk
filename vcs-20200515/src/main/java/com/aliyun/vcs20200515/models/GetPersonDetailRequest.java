// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetPersonDetailRequest extends TeaModel {
    @NameInMap("AlgorithmType")
    public String algorithmType;

    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("PersonID")
    public String personID;

    public static GetPersonDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPersonDetailRequest self = new GetPersonDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetPersonDetailRequest setAlgorithmType(String algorithmType) {
        this.algorithmType = algorithmType;
        return this;
    }
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    public GetPersonDetailRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetPersonDetailRequest setPersonID(String personID) {
        this.personID = personID;
        return this;
    }
    public String getPersonID() {
        return this.personID;
    }

}
