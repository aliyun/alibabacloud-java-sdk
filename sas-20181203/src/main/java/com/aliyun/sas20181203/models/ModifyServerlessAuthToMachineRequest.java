// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyServerlessAuthToMachineRequest extends TeaModel {
    /**
     * <p>Application query condition.</p>
     * 
     * <strong>example:</strong>
     * <p>**7ad7e3a</p>
     */
    @NameInMap("AppCriteria")
    public String appCriteria;

    /**
     * <p>Instance type. Values:</p>
     * <ul>
     * <li><strong>SERVERLESS</strong>: Serverless asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SERVERLESS</p>
     */
    @NameInMap("AuthItem")
    public String authItem;

    /**
     * <p>Enable auto-binding. Values:</p>
     * <ul>
     * <li><strong>0</strong>: Off</li>
     * <li><strong>1</strong>: On</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoBind")
    public Integer autoBind;

    /**
     * <p>Whether to bind all. Default is <strong>false</strong>. Values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes</li>
     * <li><strong>false</strong>: No</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BindAll")
    public Boolean bindAll;

    /**
     * <p>List of application IDs to be bound.</p>
     * <blockquote>
     * <p>Obtained through the <a href="~~ListMachineApps~~">ListMachineApps</a> interface.</p>
     * </blockquote>
     */
    @NameInMap("BindAppList")
    public java.util.List<String> bindAppList;

    /**
     * <p>Type of asset to operate on. Values:</p>
     * <ul>
     * <li><strong>INSTANCE</strong>: Instance</li>
     * <li><strong>APP</strong>: Application</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>APP</p>
     */
    @NameInMap("BindAssetType")
    public String bindAssetType;

    /**
     * <p>List of asset UUIDs to be bound.</p>
     */
    @NameInMap("BindUuidList")
    public java.util.List<String> bindUuidList;

    /**
     * <p>Set the conditions for searching assets. This parameter is in JSON format, and case sensitivity should be noted when entering parameters.</p>
     * <blockquote>
     * <p>Supports searching assets using instance ID, instance name, VPC ID, region, public IP address, etc. You can call the <a href="~~DescribeCriteria~~">DescribeCriteria</a> interface to query supported search conditions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;vulStatus&quot;,&quot;value&quot;:&quot;YES&quot;,&quot;logicalExp&quot;:&quot;AND&quot;}]</p>
     */
    @NameInMap("Criteria")
    public String criteria;

    /**
     * <p>Set the logical relationship between multiple search conditions. Values:</p>
     * <ul>
     * <li><strong>OR</strong>: Indicates an <strong>or</strong> relationship between multiple conditions.</li>
     * <li><strong>AND</strong>: Indicates an <strong>and</strong> relationship between multiple conditions.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OR</p>
     */
    @NameInMap("LogicalExp")
    public String logicalExp;

    /**
     * <p>NTM version code, used for pre-binding.</p>
     * 
     * <strong>example:</strong>
     * <p>level2</p>
     */
    @NameInMap("NtmVersion")
    public String ntmVersion;

    /**
     * <p>Whether it is a pre-bind operation. Values:</p>
     * <ul>
     * <li><strong>0</strong>: No</li>
     * <li><strong>1</strong>: Yes</li>
     * </ul>
     * <blockquote>
     * <p>After enabling pre-binding, the specified server will automatically bind the corresponding version\&quot;s authorization count after the purchase is completed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PreBind")
    public Integer preBind;

    /**
     * <p>Pre-bind order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>233016**0482</p>
     */
    @NameInMap("PreBindOrderId")
    public Long preBindOrderId;

    /**
     * <p>UID of the associated resource directory.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ResourceDirectoryUid")
    public Long resourceDirectoryUid;

    /**
     * <p>List of application IDs to be unbound.</p>
     * <blockquote>
     * <p>Obtained through the <a href="~~ListMachineApps~~">ListMachineApps</a> interface.</p>
     * </blockquote>
     */
    @NameInMap("UnBindAppList")
    public java.util.List<String> unBindAppList;

    /**
     * <p>List of asset UUIDs to be unbound.</p>
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
