// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListOmsSyncScenariosResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListOmsSyncScenariosResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListOmsSyncScenariosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOmsSyncScenariosResponseBody self = new ListOmsSyncScenariosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOmsSyncScenariosResponseBody setData(ListOmsSyncScenariosResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOmsSyncScenariosResponseBodyData getData() {
        return this.data;
    }

    public ListOmsSyncScenariosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListOmsSyncScenariosResponseBodyData extends TeaModel {
        @NameInMap("OpenedScenarios")
        public java.util.List<String> openedScenarios;

        public static ListOmsSyncScenariosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOmsSyncScenariosResponseBodyData self = new ListOmsSyncScenariosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOmsSyncScenariosResponseBodyData setOpenedScenarios(java.util.List<String> openedScenarios) {
            this.openedScenarios = openedScenarios;
            return this;
        }
        public java.util.List<String> getOpenedScenarios() {
            return this.openedScenarios;
        }

    }

}
