// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListWebInstancesOutput extends TeaModel {
    @NameInMap("CurrentError")
    public String currentError;

    @NameInMap("WebInstances")
    public java.util.List<WebInstanceInfo> webInstances;

    @NameInMap("WebVersionStatus")
    public java.util.Map<String, WebVersionStatus> webVersionStatus;

    public static ListWebInstancesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListWebInstancesOutput self = new ListWebInstancesOutput();
        return TeaModel.build(map, self);
    }

    public ListWebInstancesOutput setCurrentError(String currentError) {
        this.currentError = currentError;
        return this;
    }
    public String getCurrentError() {
        return this.currentError;
    }

    public ListWebInstancesOutput setWebInstances(java.util.List<WebInstanceInfo> webInstances) {
        this.webInstances = webInstances;
        return this;
    }
    public java.util.List<WebInstanceInfo> getWebInstances() {
        return this.webInstances;
    }

    public ListWebInstancesOutput setWebVersionStatus(java.util.Map<String, WebVersionStatus> webVersionStatus) {
        this.webVersionStatus = webVersionStatus;
        return this;
    }
    public java.util.Map<String, WebVersionStatus> getWebVersionStatus() {
        return this.webVersionStatus;
    }

}
