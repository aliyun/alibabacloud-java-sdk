// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyClearLogstoreStorageRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the Logstore that stores logs.</p>
     */
    @NameInMap("UserLogStore")
    public String userLogStore;

    /**
     * <p>The name of the project.</p>
     */
    @NameInMap("UserProject")
    public String userProject;

    public static ModifyClearLogstoreStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClearLogstoreStorageRequest self = new ModifyClearLogstoreStorageRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClearLogstoreStorageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public ModifyClearLogstoreStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyClearLogstoreStorageRequest setUserLogStore(String userLogStore) {
        this.userLogStore = userLogStore;
        return this;
    }
    public String getUserLogStore() {
        return this.userLogStore;
    }

    public ModifyClearLogstoreStorageRequest setUserProject(String userProject) {
        this.userProject = userProject;
        return this;
    }
    public String getUserProject() {
        return this.userProject;
    }

}
