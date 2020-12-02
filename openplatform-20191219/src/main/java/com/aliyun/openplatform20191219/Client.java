// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openplatform20191219;

import com.aliyun.tea.*;
import com.aliyun.openplatform20191219.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("openplatform", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public AuthorizeFileUploadResponse authorizeFileUploadWithOptions(AuthorizeFileUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AuthorizeFileUpload", "HTTPS", "GET", "2019-12-19", "AK", TeaModel.buildMap(request), null, runtime), new AuthorizeFileUploadResponse());
    }

    public AuthorizeFileUploadResponse authorizeFileUpload(AuthorizeFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeFileUploadWithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
