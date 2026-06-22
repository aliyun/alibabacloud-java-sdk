// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyServerlessAuthToMachineRequest extends TeaModel {
    /**
     * <p>The application query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>**7ad7e3a</p>
     */
    @NameInMap("AppCriteria")
    public String appCriteria;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>SERVERLESS</strong>: Serverless asset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SERVERLESS</p>
     */
    @NameInMap("AuthItem")
    public String authItem;

    /**
     * <p>Specifies whether to enable automatic binding. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>Specifies whether to bind all assets. Default value: <strong>false</strong>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Bind all assets.</li>
     * <li><strong>false</strong>: Do not bind all assets.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    /**
     * <p>The list of application IDs to bind.</p>
     * <blockquote>
     * <p>Retrieve the IDs by calling the <a href="~~ListMachineApps~~">ListMachineApps</a> operation.</p>
     * </blockquote>
     */
    @NameInMap("BindAppList")
    public java.util.List<String> bindAppList;

    /**
     * <p>The Asset Type for the operation. Valid values:</p>
     * <ul>
     * <li><strong>INSTANCE</strong>: instance.</li>
     * <li><strong>APP</strong>: application.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("BindAssetType")
    public String bindAssetType;

    /**
     * <p>The list of asset UUIDs to bind.</p>
     */
    @NameInMap("BindUuidList")
    public java.util.List<String> bindUuidList;

    /**
     * <p>The search conditions for assets. This parameter is in JSON format. Pay attention to letter case when specifying this parameter.</p>
     * <blockquote>
     * <p>You can search for assets by instance ID, instance name, VPC ID, region, public IP address, and other conditions. Call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> operation to query supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;vulStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>The logical relationship among multiple search conditions. Valid values:</p>
     * <ul>
     * <li><strong>OR</strong>: The search conditions are evaluated with a logical OR.</li>
     * <li><strong>AND</strong>: The search conditions are evaluated with a logical AND.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>The NTM version code for pre-binding.</p>
     * 
     * <strong>example:</strong>
     * <p>level2</p>
     */
    @NameInMap("NtmVersion")
    public String ntmVersion;

    /**
     * <p>Specifies whether to perform a pre-binding operation. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * <blockquote>
     * <p>After pre-binding is enabled, the corresponding edition authorization quota is automatically bound to the specified servers after the purchase is completed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PreBind")
    public Integer preBind;

    /**
     * <p>The pre-binding order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>233016**0482</p>
     */
    @NameInMap("PreBindOrderId")
    public Long preBindOrderId;

    /**
     * <p>The UID of the resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ResourceDirectoryUid")
    public Long resourceDirectoryUid;

    /**
     * <p>The list of application IDs to unbind.</p>
     * <blockquote>
     * <p>Retrieve the IDs by calling the <a href="~~ListMachineApps~~">ListMachineApps</a> operation.</p>
     * </blockquote>
     */
    @NameInMap("UnBindAppList")
    public java.util.List<String> unBindAppList;

    /**
     * <p>The list of asset UUIDs to unbind.</p>
     */
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
