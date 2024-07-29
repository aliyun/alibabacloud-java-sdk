// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class StartCategoryCallbackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>223***JQb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Callback")
    public StartCategoryCallbackRequestCallback callback;

    public static StartCategoryCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCategoryCallbackRequest self = new StartCategoryCallbackRequest();
        return TeaModel.build(map, self);
    }

    public StartCategoryCallbackRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartCategoryCallbackRequest setCallback(StartCategoryCallbackRequestCallback callback) {
        this.callback = callback;
        return this;
    }
    public StartCategoryCallbackRequestCallback getCallback() {
        return this.callback;
    }

    public static class StartCategoryCallbackRequestCallback extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RecordEvent</p>
         */
        @NameInMap("Category")
        public String category;

        public static StartCategoryCallbackRequestCallback build(java.util.Map<String, ?> map) throws Exception {
            StartCategoryCallbackRequestCallback self = new StartCategoryCallbackRequestCallback();
            return TeaModel.build(map, self);
        }

        public StartCategoryCallbackRequestCallback setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

    }

}
