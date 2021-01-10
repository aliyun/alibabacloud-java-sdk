// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSHelmRepoChartResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ChartName")
    public String chartName;

    @NameInMap("ChartVersion")
    public String chartVersion;

    @NameInMap("Description")
    public String description;

    @NameInMap("HelmRepoChartTree")
    public String helmRepoChartTree;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("Readme")
    public String readme;

    public static GetAKSHelmRepoChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAKSHelmRepoChartResponseBody self = new GetAKSHelmRepoChartResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAKSHelmRepoChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAKSHelmRepoChartResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAKSHelmRepoChartResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetAKSHelmRepoChartResponseBody setChartName(String chartName) {
        this.chartName = chartName;
        return this;
    }
    public String getChartName() {
        return this.chartName;
    }

    public GetAKSHelmRepoChartResponseBody setChartVersion(String chartVersion) {
        this.chartVersion = chartVersion;
        return this;
    }
    public String getChartVersion() {
        return this.chartVersion;
    }

    public GetAKSHelmRepoChartResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetAKSHelmRepoChartResponseBody setHelmRepoChartTree(String helmRepoChartTree) {
        this.helmRepoChartTree = helmRepoChartTree;
        return this;
    }
    public String getHelmRepoChartTree() {
        return this.helmRepoChartTree;
    }

    public GetAKSHelmRepoChartResponseBody setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public GetAKSHelmRepoChartResponseBody setReadme(String readme) {
        this.readme = readme;
        return this;
    }
    public String getReadme() {
        return this.readme;
    }

}
