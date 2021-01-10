// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutBatchnextstageRequest extends TeaModel {
    @NameInMap("FromStageIdsRepeatList")
    public java.util.List<String> fromStageIdsRepeatList;

    @NameInMap("IterationUnitIdsRepeatList")
    public java.util.List<String> iterationUnitIdsRepeatList;

    @NameInMap("ToStageIdsRepeatList")
    public java.util.List<String> toStageIdsRepeatList;

    @NameInMap("UserAccount")
    public String userAccount;

    public static QueryLinkeBahamutBatchnextstageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutBatchnextstageRequest self = new QueryLinkeBahamutBatchnextstageRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutBatchnextstageRequest setFromStageIdsRepeatList(java.util.List<String> fromStageIdsRepeatList) {
        this.fromStageIdsRepeatList = fromStageIdsRepeatList;
        return this;
    }
    public java.util.List<String> getFromStageIdsRepeatList() {
        return this.fromStageIdsRepeatList;
    }

    public QueryLinkeBahamutBatchnextstageRequest setIterationUnitIdsRepeatList(java.util.List<String> iterationUnitIdsRepeatList) {
        this.iterationUnitIdsRepeatList = iterationUnitIdsRepeatList;
        return this;
    }
    public java.util.List<String> getIterationUnitIdsRepeatList() {
        return this.iterationUnitIdsRepeatList;
    }

    public QueryLinkeBahamutBatchnextstageRequest setToStageIdsRepeatList(java.util.List<String> toStageIdsRepeatList) {
        this.toStageIdsRepeatList = toStageIdsRepeatList;
        return this;
    }
    public java.util.List<String> getToStageIdsRepeatList() {
        return this.toStageIdsRepeatList;
    }

    public QueryLinkeBahamutBatchnextstageRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
