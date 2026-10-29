// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class StartRenderingSessionRequest extends TeaModel {
    /**
     * <p>The cloud application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cap-b06b26edfhytbn b94a75ae1a79efc90eb</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The unique ID of the end user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>04c30850-1d91-4da1-b811-66d0ee94af7d</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The parameter information of the end user.</p>
     */
    @NameInMap("ClientParams")
    public StartRenderingSessionRequestClientParams clientParams;

    /**
     * <p>The cloud application patch package ID.</p>
     * <ol>
     * <li>By default, the stable version of the application specified by AppId is started. If no stable patch version is set, the original version is started.</li>
     * <li>If you specify origin, the original version is started.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>patch-03fa76e8e13a49b63456b063dgh309b4</p>
     */
    @NameInMap("PatchId")
    public String patchId;

    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>project-422bc38dfgh5eb44149f135ef76304f63b</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static StartRenderingSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartRenderingSessionRequest self = new StartRenderingSessionRequest();
        return TeaModel.build(map, self);
    }

    public StartRenderingSessionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public StartRenderingSessionRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public StartRenderingSessionRequest setClientParams(StartRenderingSessionRequestClientParams clientParams) {
        this.clientParams = clientParams;
        return this;
    }
    public StartRenderingSessionRequestClientParams getClientParams() {
        return this.clientParams;
    }

    public StartRenderingSessionRequest setPatchId(String patchId) {
        this.patchId = patchId;
        return this;
    }
    public String getPatchId() {
        return this.patchId;
    }

    public StartRenderingSessionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class StartRenderingSessionRequestClientParams extends TeaModel {
        /**
         * <p>The IP address of the end user. By default, this IP address is used for proximity-based instance scheduling.</p>
         * 
         * <strong>example:</strong>
         * <p>106.11.43.1</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        public static StartRenderingSessionRequestClientParams build(java.util.Map<String, ?> map) throws Exception {
            StartRenderingSessionRequestClientParams self = new StartRenderingSessionRequestClientParams();
            return TeaModel.build(map, self);
        }

        public StartRenderingSessionRequestClientParams setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

    }

}
