<template>
	<view>
		<view class="tip">
			说明：投稿审核通过后会有积分奖励；资源被下载会有积分奖励；资源被下载会有积分奖励；提交的资源不得包含
			广告、侵权信息；百度盘地址建议有密码。
		</view>
		<view class="item-row">
		<view class="subtitle">原创</view>
		</view>
		<view class="item-row">
			<view class="subtitle">转载</view>
		</view>
		<view class="item-row">
			<view class="subtitle">标题</view>
			<input type="text" placeholder="请输入标题" class="input-style" />
		</view>
		<view class="item-row">
			<view class="subtitle">作者</view>
			<input type="text" placeholder="请输入作者" class="input-style" />
		</view>
		<view class="item-row">
			<view class="subtitle">价格</view>
			<input type="number" placeholder="请输入价格" class="input-style" />
		</view>
		<view class="item-row">
			<view class="subtitle">简介</view>
			<input type="text" placeholder="介绍一下技术干货吧" class="input-style" />
		</view>
		<view class="item-row">
			<view class="subtitle">下载地址</view>
			<input type="text" placeholder="请输入下载地址" class="input-style" />
		</view>
		<button class="btn-big">提交</button>
	</view>
</template>
<style scoped>
	.tip{
		padding: 20upx;
		height: 100upx;
		font-size: 12px;
		border-bottom: 1px solid #dfdfdf;
	}
	.item-row{
		display: flex;
		padding: 15upx;
		height: 48upx;
		border-bottom: 1px solid #dfdfdf;
	}
	.flex-around{
		display: flex;
		align-items: center;
		justify-content: space-around;
	}
	.subtitle{
		font-size: 14px;
		width: 25%;
	}
	.input-style{
		width: 75%;
		
	}
	.btn-big{
		background-color: #fe4543;
		color: #ffffff;
		height: 50px;
		
	}
	
</style>
