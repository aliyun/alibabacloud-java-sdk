// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315;

import com.aliyun.tea.*;
import com.aliyun.snapshot20210315.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
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

    public GetSnapshotInfoResponse getSnapshotInfo(GetSnapshotInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSnapshotInfoWithOptions(request, headers, runtime);
    }

    public GetSnapshotInfoResponse getSnapshotInfoWithOptions(GetSnapshotInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDetail)) {
            query.put("ShowDetail", request.showDetail);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetSnapshotInfo", "2021-03-15", "HTTPS", "GET", "AK", "/snapshots/info", "json", req, runtime), new GetSnapshotInfoResponse());
    }

    public GetSnapshotBlockResponse getSnapshotBlock(GetSnapshotBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSnapshotBlockWithOptions(request, headers, runtime);
    }

    public GetSnapshotBlockResponse getSnapshotBlockWithOptions(GetSnapshotBlockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockIndex)) {
            query.put("BlockIndex", request.blockIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockToken)) {
            query.put("BlockToken", request.blockToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        GetSnapshotBlockResponse res = new GetSnapshotBlockResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("GetSnapshotBlock", "2021-03-15", "HTTPS", "GET", "AK", "/snapshots/block", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public ListSnapshotBlocksResponse listSnapshotBlocks(ListSnapshotBlocksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSnapshotBlocksWithOptions(request, headers, runtime);
    }

    public ListSnapshotBlocksResponse listSnapshotBlocksWithOptions(ListSnapshotBlocksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startingBlockIndex)) {
            query.put("StartingBlockIndex", request.startingBlockIndex);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSnapshotBlocks", "2021-03-15", "HTTPS", "GET", "AK", "/snapshots/listblocks", "json", req, runtime), new ListSnapshotBlocksResponse());
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
        return TeaModel.toModel(this.doROARequest("ListChangedBlocks", "2021-03-15", "HTTPS", "GET", "AK", "/snapshots/changedblocks", "json", req, runtime), new ListChangedBlocksResponse());
    }
}
