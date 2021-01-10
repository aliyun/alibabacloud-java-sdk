// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationaddunitRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("BranchPostfix")
    public String branchPostfix;

    @NameInMap("FromTag")
    public String fromTag;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("MembersRepeatList")
    public java.util.List<String> membersRepeatList;

    @NameInMap("SameBranch")
    public String sameBranch;

    @NameInMap("Stringversion")
    public String stringversion;

    @NameInMap("WorkItemsRepeatList")
    public java.util.List<String> workItemsRepeatList;

    public static QueryLinkeBahamutIterationaddunitRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationaddunitRequest self = new QueryLinkeBahamutIterationaddunitRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationaddunitRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutIterationaddunitRequest setBranchPostfix(String branchPostfix) {
        this.branchPostfix = branchPostfix;
        return this;
    }
    public String getBranchPostfix() {
        return this.branchPostfix;
    }

    public QueryLinkeBahamutIterationaddunitRequest setFromTag(String fromTag) {
        this.fromTag = fromTag;
        return this;
    }
    public String getFromTag() {
        return this.fromTag;
    }

    public QueryLinkeBahamutIterationaddunitRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkeBahamutIterationaddunitRequest setMembersRepeatList(java.util.List<String> membersRepeatList) {
        this.membersRepeatList = membersRepeatList;
        return this;
    }
    public java.util.List<String> getMembersRepeatList() {
        return this.membersRepeatList;
    }

    public QueryLinkeBahamutIterationaddunitRequest setSameBranch(String sameBranch) {
        this.sameBranch = sameBranch;
        return this;
    }
    public String getSameBranch() {
        return this.sameBranch;
    }

    public QueryLinkeBahamutIterationaddunitRequest setStringversion(String stringversion) {
        this.stringversion = stringversion;
        return this;
    }
    public String getStringversion() {
        return this.stringversion;
    }

    public QueryLinkeBahamutIterationaddunitRequest setWorkItemsRepeatList(java.util.List<String> workItemsRepeatList) {
        this.workItemsRepeatList = workItemsRepeatList;
        return this;
    }
    public java.util.List<String> getWorkItemsRepeatList() {
        return this.workItemsRepeatList;
    }

}
