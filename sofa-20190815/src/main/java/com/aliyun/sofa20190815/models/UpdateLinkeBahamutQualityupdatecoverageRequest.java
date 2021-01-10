// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutQualityupdatecoverageRequest extends TeaModel {
    @NameInMap("GitBranch")
    public String gitBranch;

    @NameInMap("Group")
    public String group;

    @NameInMap("Host")
    public String host;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static UpdateLinkeBahamutQualityupdatecoverageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutQualityupdatecoverageRequest self = new UpdateLinkeBahamutQualityupdatecoverageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutQualityupdatecoverageRequest setGitBranch(String gitBranch) {
        this.gitBranch = gitBranch;
        return this;
    }
    public String getGitBranch() {
        return this.gitBranch;
    }

    public UpdateLinkeBahamutQualityupdatecoverageRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public UpdateLinkeBahamutQualityupdatecoverageRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public UpdateLinkeBahamutQualityupdatecoverageRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
