// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20201118;

import com.aliyun.tea.*;
import com.aliyun.snapshot20201118.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("snapshot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListChangedBlocksResponse listChangedBlocks(ListChangedBlocksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChangedBlocksWithOptions(request, headers, runtime);
    }

    public ListChangedBlocksResponse listChangedBlocksWithOptions(ListChangedBlocksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstSnapshotId)) {
            query.put("FirstSnapshotId", request.firstSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondSnapshotId)) {
            query.put("SecondSnapshotId", request.secondSnapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startingBlockIndex)) {
            query.put("StartingBlockIndex", request.startingBlockIndex);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListChangedBlocks", "2020-11-18", "HTTPS", "GET", "AK", "/snapshots/changedblocks", "json", req, runtime), new ListChangedBlocksResponse());
    }
}
