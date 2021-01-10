// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationunitbatchnextstageRequest extends TeaModel {
    @NameInMap("FromStageIdsRepeatList")
    public java.util.List<String> fromStageIdsRepeatList;

    @NameInMap("IterationUnitIdsRepeatList")
    public java.util.List<String> iterationUnitIdsRepeatList;

    @NameInMap("ToStageIdsRepeatList")
    public java.util.List<String> toStageIdsRepeatList;

    @NameInMap("UserAccount")
    public String userAccount;

    public static QueryLinkeBahamutIterationunitbatchnextstageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationunitbatchnextstageRequest self = new QueryLinkeBahamutIterationunitbatchnextstageRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationunitbatchnextstageRequest setFromStageIdsRepeatList(java.util.List<String> fromStageIdsRepeatList) {
        this.fromStageIdsRepeatList = fromStageIdsRepeatList;
        return this;
    }
    public java.util.List<String> getFromStageIdsRepeatList() {
        return this.fromStageIdsRepeatList;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageRequest setIterationUnitIdsRepeatList(java.util.List<String> iterationUnitIdsRepeatList) {
        this.iterationUnitIdsRepeatList = iterationUnitIdsRepeatList;
        return this;
    }
    public java.util.List<String> getIterationUnitIdsRepeatList() {
        return this.iterationUnitIdsRepeatList;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageRequest setToStageIdsRepeatList(java.util.List<String> toStageIdsRepeatList) {
        this.toStageIdsRepeatList = toStageIdsRepeatList;
        return this;
    }
    public java.util.List<String> getToStageIdsRepeatList() {
        return this.toStageIdsRepeatList;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
