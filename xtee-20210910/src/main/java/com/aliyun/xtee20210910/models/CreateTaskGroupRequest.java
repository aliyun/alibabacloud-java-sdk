// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateTaskGroupRequest extends TeaModel {
    /**
     * <p>The language of the error message returned by the operation. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * <p>Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>The sample IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("SampleIds")
    public String sampleIds;

    /**
     * <p>The scenarios corresponding to the service.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;porn\&quot;,\&quot;terrorism\&quot;,\&quot;ad\&quot;]</p>
     */
    @NameInMap("Scenes")
    public String scenes;

    /**
     * <p>The service codes.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("ServiceCodes")
    public String serviceCodes;

    /**
     * <p>The service list.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;serviceCode&quot;:&quot;anti_fraud_v4_score&quot;},{&quot;serviceCode&quot;:&quot;antif2_score&quot;},{&quot;serviceCode&quot;:&quot;anti_fraud_customed&quot;,&quot;scenes&quot;:[&quot;TC_general_1&quot;,&quot;aliyun_cust_feat_all&quot;]},{&quot;serviceCode&quot;:&quot;antif2_customed_plus&quot;,&quot;scenes&quot;:[&quot;antif2_customed_v1_feature&quot;]}]</p>
     */
    @NameInMap("ServiceList")
    public String serviceList;

    /**
     * <p>The list of service names for per-application statistics.</p>
     * 
     * <strong>example:</strong>
     * <p>Test</p>
     */
    @NameInMap("ServiceNames")
    public String serviceNames;

    /**
     * <p>The scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>INTERNET</p>
     */
    @NameInMap("Tab")
    public String tab;

    /**
     * <p>The task group name.</p>
     * 
     * <strong>example:</strong>
     * <p>TeskGroupTest</p>
     */
    @NameInMap("TaskGroupName")
    public String taskGroupName;

    /**
     * <p>The access type.</p>
     * 
     * <strong>example:</strong>
     * <p>SAF_CONSOLE</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateTaskGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskGroupRequest self = new CreateTaskGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTaskGroupRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CreateTaskGroupRequest setSampleIds(String sampleIds) {
        this.sampleIds = sampleIds;
        return this;
    }
    public String getSampleIds() {
        return this.sampleIds;
    }

    public CreateTaskGroupRequest setScenes(String scenes) {
        this.scenes = scenes;
        return this;
    }
    public String getScenes() {
        return this.scenes;
    }

    public CreateTaskGroupRequest setServiceCodes(String serviceCodes) {
        this.serviceCodes = serviceCodes;
        return this;
    }
    public String getServiceCodes() {
        return this.serviceCodes;
    }

    public CreateTaskGroupRequest setServiceList(String serviceList) {
        this.serviceList = serviceList;
        return this;
    }
    public String getServiceList() {
        return this.serviceList;
    }

    public CreateTaskGroupRequest setServiceNames(String serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }
    public String getServiceNames() {
        return this.serviceNames;
    }

    public CreateTaskGroupRequest setTab(String tab) {
        this.tab = tab;
        return this;
    }
    public String getTab() {
        return this.tab;
    }

    public CreateTaskGroupRequest setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
        return this;
    }
    public String getTaskGroupName() {
        return this.taskGroupName;
    }

    public CreateTaskGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
