// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903.models;

import com.aliyun.tea.*;

public class ExecuteComponentRequest extends TeaModel {
    /**
     * <p>The name of the component action.</p>
     * 
     * <strong>example:</strong>
     * <p>doRequest</p>
     */
    @NameInMap("ComponentActionName")
    public String componentActionName;

    /**
     * <p>Asset UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>1C5F11E9-<strong><strong>-51F0-</strong></strong>-43BB312A0557</p>
     */
    @NameInMap("ComponentAssetUuid")
    public String componentAssetUuid;

    /**
     * <p>Component input parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("ComponentInput")
    public String componentInput;

    /**
     * <p>The name of the component.</p>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ComponentName")
    public String componentName;

    /**
     * <p>The language type for requests and responses. Values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the node corresponding to the current component in the playbook.</p>
     * 
     * <strong>example:</strong>
     * <p>node1</p>
     */
    @NameInMap("PlayBookNodeName")
    public String playBookNodeName;

    /**
     * <p>The UUID of the playbook.</p>
     * <blockquote>
     * <p>You can obtain this parameter by calling the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a> interface.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ac343acc-1a61-4084-9a1cxxxxx</p>
     */
    @NameInMap("PlaybookUuid")
    public String playbookUuid;

    public static ExecuteComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteComponentRequest self = new ExecuteComponentRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteComponentRequest setComponentActionName(String componentActionName) {
        this.componentActionName = componentActionName;
        return this;
    }
    public String getComponentActionName() {
        return this.componentActionName;
    }

    public ExecuteComponentRequest setComponentAssetUuid(String componentAssetUuid) {
        this.componentAssetUuid = componentAssetUuid;
        return this;
    }
    public String getComponentAssetUuid() {
        return this.componentAssetUuid;
    }

    public ExecuteComponentRequest setComponentInput(String componentInput) {
        this.componentInput = componentInput;
        return this;
    }
    public String getComponentInput() {
        return this.componentInput;
    }

    public ExecuteComponentRequest setComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }
    public String getComponentName() {
        return this.componentName;
    }

    public ExecuteComponentRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecuteComponentRequest setPlayBookNodeName(String playBookNodeName) {
        this.playBookNodeName = playBookNodeName;
        return this;
    }
    public String getPlayBookNodeName() {
        return this.playBookNodeName;
    }

    public ExecuteComponentRequest setPlaybookUuid(String playbookUuid) {
        this.playbookUuid = playbookUuid;
        return this;
    }
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

}
