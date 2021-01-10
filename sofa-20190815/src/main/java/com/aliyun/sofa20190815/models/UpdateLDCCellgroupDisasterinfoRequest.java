// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCCellgroupDisasterinfoRequest extends TeaModel {
    @NameInMap("DisasterInfo")
    public java.util.List<UpdateLDCCellgroupDisasterinfoRequestDisasterInfo> disasterInfo;

    @NameInMap("Name")
    public String name;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCCellgroupDisasterinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCCellgroupDisasterinfoRequest self = new UpdateLDCCellgroupDisasterinfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCCellgroupDisasterinfoRequest setDisasterInfo(java.util.List<UpdateLDCCellgroupDisasterinfoRequestDisasterInfo> disasterInfo) {
        this.disasterInfo = disasterInfo;
        return this;
    }
    public java.util.List<UpdateLDCCellgroupDisasterinfoRequestDisasterInfo> getDisasterInfo() {
        return this.disasterInfo;
    }

    public UpdateLDCCellgroupDisasterinfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCCellgroupDisasterinfoRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLDCCellgroupDisasterinfoRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public static class UpdateLDCCellgroupDisasterinfoRequestDisasterInfo extends TeaModel {
        @NameInMap("DisasterRecoveryState")
        public String disasterRecoveryState;

        @NameInMap("LocalFailoverTarget")
        public String localFailoverTarget;

        @NameInMap("PressDisasterRecoveryState")
        public String pressDisasterRecoveryState;

        @NameInMap("RemoteFailoverTarget")
        public String remoteFailoverTarget;

        @NameInMap("Source")
        public String source;

        @NameInMap("Type")
        public String type;

        public static UpdateLDCCellgroupDisasterinfoRequestDisasterInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateLDCCellgroupDisasterinfoRequestDisasterInfo self = new UpdateLDCCellgroupDisasterinfoRequestDisasterInfo();
            return TeaModel.build(map, self);
        }

        public UpdateLDCCellgroupDisasterinfoRequestDisasterInfo setDisasterRecoveryState(String disasterRecoveryState) {
            this.disasterRecoveryState = disasterRecoveryState;
            return this;
        }
        public String getDisasterRecoveryState() {
            return this.disasterRecoveryState;
        }

        public UpdateLDCCellgroupDisasterinfoRequestDisasterInfo setLocalFailoverTarget(String localFailoverTarget) {
            this.localFailoverTarget = localFailoverTarget;
            return this;
        }
        public String getLocalFailoverTarget() {
            return this.localFailoverTarget;
        }

        public UpdateLDCCellgroupDisasterinfoRequestDisasterInfo setPressDisasterRecoveryState(String pressDisasterRecoveryState) {
            this.pressDisasterRecoveryState = pressDisasterRecoveryState;
            return this;
        }
        public String getPressDisasterRecoveryState() {
            return this.pressDisasterRecoveryState;
        }

        public UpdateLDCCellgroupDisasterinfoRequestDisasterInfo setRemoteFailoverTarget(String remoteFailoverTarget) {
            this.remoteFailoverTarget = remoteFailoverTarget;
            return this;
        }
        public String getRemoteFailoverTarget() {
            return this.remoteFailoverTarget;
        }

        public UpdateLDCCellgroupDisasterinfoRequestDisasterInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public UpdateLDCCellgroupDisasterinfoRequestDisasterInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
