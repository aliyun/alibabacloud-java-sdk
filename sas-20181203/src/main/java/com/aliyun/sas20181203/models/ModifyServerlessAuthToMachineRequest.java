// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyServerlessAuthToMachineRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>**7ad7e3a</p>
     */
    @NameInMap("AppCriteria")
    public String appCriteria;

    /**
     * <strong>example:</strong>
     * <p>SERVERLESS</p>
     */
    @NameInMap("AuthItem")
    public String authItem;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    @NameInMap("BindAppList")
    public java.util.List<String> bindAppList;

    /**
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("BindAssetType")
    public String bindAssetType;

    @NameInMap("BindUuidList")
    public java.util.List<String> bindUuidList;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;vulStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <strong>example:</strong>
     * <p>level2</p>
     */
    @NameInMap("NtmVersion")
    public String ntmVersion;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PreBind")
    public Integer preBind;

    /**
     * <strong>example:</strong>
     * <p>233016**0482</p>
     */
    @NameInMap("PreBindOrderId")
    public Long preBindOrderId;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ResourceDirectoryUid")
    public Long resourceDirectoryUid;

    @NameInMap("UnBindAppList")
    public java.util.List<String> unBindAppList;

    @NameInMap("UnBindUuidList")
    public java.util.List<String> unBindUuidList;

    public static ModifyServerlessAuthToMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyServerlessAuthToMachineRequest self = new ModifyServerlessAuthToMachineRequest();
        return TeaModel.build(map, self);
    }

    public ModifyServerlessAuthToMachineRequest setAppCriteria(String appCriteria) {
        this.appCriteria = appCriteria;
        return this;
    }
    public String getAppCriteria() {
        return this.appCriteria;
    }

    public ModifyServerlessAuthToMachineRequest setAuthItem(String authItem) {
        this.authItem = authItem;
        return this;
    }
    public String getAuthItem() {
        return this.authItem;
    }

    public ModifyServerlessAuthToMachineRequest setAutoBind(Integer autoBind) {
        this.autoBind = autoBind;
        return this;
    }
    public Integer getAutoBind() {
        return this.autoBind;
    }

    public ModifyServerlessAuthToMachineRequest setBindAll(Boolean bindAll) {
        this.bindAll = bindAll;
        return this;
    }
    public Boolean getBindAll() {
        return this.bindAll;
    }

    public ModifyServerlessAuthToMachineRequest setBindAppList(java.util.List<String> bindAppList) {
        this.bindAppList = bindAppList;
        return this;
    }
    public java.util.List<String> getBindAppList() {
        return this.bindAppList;
    }

    public ModifyServerlessAuthToMachineRequest setBindAssetType(String bindAssetType) {
        this.bindAssetType = bindAssetType;
        return this;
    }
    public String getBindAssetType() {
        return this.bindAssetType;
    }

    public ModifyServerlessAuthToMachineRequest setBindUuidList(java.util.List<String> bindUuidList) {
        this.bindUuidList = bindUuidList;
        return this;
    }
    public java.util.List<String> getBindUuidList() {
        return this.bindUuidList;
    }

    public ModifyServerlessAuthToMachineRequest setCriteria(String criteria) {
        this.criteria = criteria;
        return this;
    }
    public String getCriteria() {
        return this.criteria;
    }

    public ModifyServerlessAuthToMachineRequest setLogicalExp(String logicalExp) {
        this.logicalExp = logicalExp;
        return this;
    }
    public String getLogicalExp() {
        return this.logicalExp;
    }

    public ModifyServerlessAuthToMachineRequest setNtmVersion(String ntmVersion) {
        this.ntmVersion = ntmVersion;
        return this;
    }
    public String getNtmVersion() {
        return this.ntmVersion;
    }

    public ModifyServerlessAuthToMachineRequest setPreBind(Integer preBind) {
        this.preBind = preBind;
        return this;
    }
    public Integer getPreBind() {
        return this.preBind;
    }

    public ModifyServerlessAuthToMachineRequest setPreBindOrderId(Long preBindOrderId) {
        this.preBindOrderId = preBindOrderId;
        return this;
    }
    public Long getPreBindOrderId() {
        return this.preBindOrderId;
    }

    public ModifyServerlessAuthToMachineRequest setResourceDirectoryUid(Long resourceDirectoryUid) {
        this.resourceDirectoryUid = resourceDirectoryUid;
        return this;
    }
    public Long getResourceDirectoryUid() {
        return this.resourceDirectoryUid;
    }

    public ModifyServerlessAuthToMachineRequest setUnBindAppList(java.util.List<String> unBindAppList) {
        this.unBindAppList = unBindAppList;
        return this;
    }
    public java.util.List<String> getUnBindAppList() {
        return this.unBindAppList;
    }

    public ModifyServerlessAuthToMachineRequest setUnBindUuidList(java.util.List<String> unBindUuidList) {
        this.unBindUuidList = unBindUuidList;
        return this;
    }
    public java.util.List<String> getUnBindUuidList() {
        return this.unBindUuidList;
    }

}
